package com.kristovski.salesrecords.services;

import com.kristovski.salesrecords.model.SaleRecord;
import com.kristovski.salesrecords.repositories.SaleRecordRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SaleRecordServiceImpl implements SaleRecordService {


    private final SaleRecordRepository saleRecordRepository;

    public SaleRecordServiceImpl(SaleRecordRepository saleRecordRepository) {
        this.saleRecordRepository = saleRecordRepository;
    }


    @Override
    public List<SaleRecord> findAll() {
        return (List<SaleRecord>) saleRecordRepository.findAll();
    }

    @Override
    public Optional<SaleRecord> findById(long theId) {
        return saleRecordRepository.findById(theId);
    }

    @Override
    public void saveRecord(SaleRecord theSaleRecord) {

    }

    @Override
    public void deleteById(long theId) {

    }

    @Override
    public List<SaleRecord> searchBy(LocalDate theDate) {
        return null;
    }
}
