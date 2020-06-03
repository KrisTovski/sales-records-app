package com.kristovski.salesrecords.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource datacource;
    private final ObjectMapper objectMapper;
    private final RestAuthenticationSuccessHandler successHandler;
    private final RestAuthenticationFailureHandler failureHandler;

    public SecurityConfig(DataSource datacource, ObjectMapper objectMapper, RestAuthenticationSuccessHandler successHandler, RestAuthenticationFailureHandler failureHandler) {
        this.datacource = datacource;
        this.objectMapper = objectMapper;
        this.successHandler = successHandler;
        this.failureHandler = failureHandler;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .withDefaultSchema()
                .dataSource(datacource)
                .withUser("test")
                .password("{bcrypt}" + new BCryptPasswordEncoder().encode("test"))
                .roles("USER");
    }

    private static final String[] AUTH_WHITELIST = {

            // -- swagger ui
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**",
            "/swagger-resources/**",
            "/h2-console/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(authenticationFilter())
                .exceptionHandling()
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                .and()
                .headers().frameOptions().disable();
    }

    public JsonObjectAuthenticationFilter authenticationFilter() throws Exception {
        JsonObjectAuthenticationFilter authenticationFilter = new JsonObjectAuthenticationFilter(objectMapper);
        authenticationFilter.setAuthenticationSuccessHandler(successHandler);
        authenticationFilter.setAuthenticationFailureHandler(failureHandler);
        authenticationFilter.setAuthenticationManager(super.authenticationManager());
        return authenticationFilter;
    }
}
