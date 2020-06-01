package com.kristovski.salesrecords.repositories;

import com.kristovski.salesrecords.model.SaleRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface SaleRecordRepository extends JpaRepository<SaleRecord, Long> {

    List<SaleRecord> findAllBySaleDate(LocalDate saleDate);


}
