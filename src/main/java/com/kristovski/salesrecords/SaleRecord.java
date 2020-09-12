package com.kristovski.salesrecords;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class SaleRecord {

    private long id;
    private LocalDate saleDate;
    private BigDecimal sale;

    private static BigDecimal bigDecimal = new BigDecimal(50.00);
    private static LocalDate date = LocalDate.of(2020,9,12);

    public static final SaleRecord SALE_RECORD = new SaleRecord(1, date , bigDecimal);


    public SaleRecord() {
    }

    public SaleRecord(long id, LocalDate saleDate, BigDecimal sale) {
        this.id = id;
        this.saleDate = saleDate;
        this.sale = sale;
    }

    public long getId() {
        return id;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public BigDecimal getSale() {
        return sale;
    }
}
