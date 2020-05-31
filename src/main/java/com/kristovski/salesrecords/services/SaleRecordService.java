package com.kristovski.salesrecords.services;

import com.kristovski.salesrecords.model.SaleRecord;

import java.time.LocalDate;
import java.util.List;

public interface SaleRecordService {


    public List<SaleRecord> findAll();

    public SaleRecord findById(long theId);

    public void save(SaleRecord theSaleRecord);

    public void deleteById(long theId);

    public List<SaleRecord> searchBy(LocalDate theDate);

}
