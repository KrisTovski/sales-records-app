package com.kristovski.salesrecords.repositories;

import com.kristovski.salesrecords.model.SaleRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRecordRepository extends CrudRepository<SaleRecord, Long> {
}
