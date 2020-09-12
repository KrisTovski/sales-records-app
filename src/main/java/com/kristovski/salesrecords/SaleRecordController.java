package com.kristovski.salesrecords;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaleRecordController {



    @GetMapping("/records")
    public SaleRecord getSaleRecords(){
        return SaleRecord.SALE_RECORD;
    }

    @GetMapping("/records/{id}")
    public SaleRecord getSingleSaleRecord(@PathVariable long id){
        throw new IllegalArgumentException("Not implemented yet!");
    }
}
