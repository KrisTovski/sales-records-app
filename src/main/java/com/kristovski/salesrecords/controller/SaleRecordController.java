package com.kristovski.salesrecords.controller;

import com.kristovski.salesrecords.model.SaleRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleRecordController {

    @GetMapping("/records")
    public List<SaleRecord> getSaleRecords(){
        throw new IllegalArgumentException("Not implemented yet!");
    }

    @GetMapping("/records")
    public List<SaleRecord> getSingleSaleRecord(){
        throw new IllegalArgumentException("Not implemented yet!");
    }
}
