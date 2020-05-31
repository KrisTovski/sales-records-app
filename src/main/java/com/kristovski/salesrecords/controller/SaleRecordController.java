package com.kristovski.salesrecords.controller;

import com.kristovski.salesrecords.model.SaleRecord;
import com.kristovski.salesrecords.services.SaleRecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleRecordController {

    private final SaleRecordService saleRecordService;

    public SaleRecordController(SaleRecordService saleRecordService) {
        this.saleRecordService = saleRecordService;
    }

    @GetMapping("/records")
    public List<SaleRecord> getSaleRecords(){
        return saleRecordService.findAll();
    }

    @GetMapping("/records/{id}")
    public List<SaleRecord> getSingleSaleRecord(@PathVariable long id){
        throw new IllegalArgumentException("Not implemented yet!");
    }
}
