package com.kristovski.salesrecords.services;

import com.kristovski.salesrecords.model.SaleRecord;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SaleRecordServiceImpl implements SaleRecordService {

//    private final SaleRecordRepository saleRecordRepository;
//
//    public SaleRecordServiceImpl(SaleRecordRepository saleRecordRepository) {
//        this.saleRecordRepository = saleRecordRepository;
//    }

    @Override
    public List<SaleRecord> findAll() {
        return null;
    }

    @Override
    public SaleRecord findById(int theId) {
        return null;
    }

    @Override
    public void save(SaleRecord theSaleRecord) {

    }

    @Override
    public void deleteById(int theId) {

    }

    @Override
    public List<SaleRecord> searchBy(LocalDate theDate) {
        return null;
    }
}
