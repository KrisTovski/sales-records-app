package com.kristovski.salesrecords.services;

import com.kristovski.salesrecords.model.SaleRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface SaleRecordService {


    public List<SaleRecord> findAll();

    public Optional<SaleRecord> findById(long theId);

    public void saveRecord(SaleRecord theSaleRecord);

    public void deleteById(long theId);

    public List<SaleRecord> searchBy(LocalDate theDate);

}
