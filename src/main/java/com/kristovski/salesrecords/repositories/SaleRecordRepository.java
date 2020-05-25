package com.kristovski.salesrecords.repositories;

import com.kristovski.salesrecords.model.SaleRecord;
import org.springframework.data.repository.CrudRepository;

public interface SaleRecordRepository extends CrudRepository<SaleRecord, Long> {
}
