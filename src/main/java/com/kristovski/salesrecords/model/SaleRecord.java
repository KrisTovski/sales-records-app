package com.kristovski.salesrecords.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.Bidi;
import java.time.LocalDate;

@Entity
@Table(name = "sale_record")
public class SaleRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="sale_date")
    private LocalDate saleDate;

    @Column(name="sale")
    private BigDecimal sale;

    public SaleRecord() {
    }

    public SaleRecord(long id, LocalDate saleDate, BigDecimal sale){
        this.id = id;
        this.saleDate = saleDate;
        this.sale = sale;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "SaleRecord{" +
                "id=" + id +
                ", saleDate=" + saleDate +
                ", sale=" + sale +
                '}';
    }
}
