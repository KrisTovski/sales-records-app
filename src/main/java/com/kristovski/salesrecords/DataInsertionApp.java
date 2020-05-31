package com.kristovski.salesrecords;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataInsertionApp {

    public static void main(String[] args) {

        // INSERT  INTO SALE_RECORD(id, sale_date, sale) VALUES (1, TO_DATE('01-12-2019','dd-MM-yyyy'), 60.45)


        FileWriter dataSql = null;
        try {
            dataSql = new FileWriter("src/main/resources/data.sql");
            dataSql.write("");

            for (int i = 1; i < 100; i++) {
                dataSql.append(
                        "INSERT INTO sale_record(id, sale_date, sale) " +
                        "VALUES (" + i +", "
                                + "TO_DATE('"+ DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDateTime.now().minusDays(100 - i)) +"','dd-MM-yyyy'),"
                                + "10."+i+")\n");
            };

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
