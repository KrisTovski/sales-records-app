package com.kristovski.salesrecords.controller;

import com.kristovski.salesrecords.model.SaleRecord;
import com.kristovski.salesrecords.services.SaleRecordService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/records")
    public SaleRecord addSaleRecord(@RequestBody SaleRecord theSaleRecord){
        theSaleRecord.setId(0);
        saleRecordService.saveRecord(theSaleRecord);
        return theSaleRecord;
    }
}
