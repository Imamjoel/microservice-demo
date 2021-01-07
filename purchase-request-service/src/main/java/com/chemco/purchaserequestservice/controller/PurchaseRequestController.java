package com.chemco.purchaserequestservice.controller;

import com.chemco.purchaserequestservice.entity.PurchaseRequest;
import com.chemco.purchaserequestservice.service.PurchaseRequestService;
import com.chemco.purchaserequestservice.template.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchaseRequest")
@Slf4j
public class PurchaseRequestController {

    @Autowired
    public PurchaseRequestService purchaseRequestService;

    @PostMapping("/save")
    public PurchaseRequest save(@RequestBody PurchaseRequest purchaseRequest) {
        return purchaseRequestService.save(purchaseRequest);
    }


    public PurchaseRequest getPurchaseRequestById(@PathVariable("id") Long purchaseRequestId) {
        return purchaseRequestService.findByPurchaseRequestId(purchaseRequestId);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getItemByPurchaseRequestId(@PathVariable("id") Long purchaseRequestId) {
       return purchaseRequestService.getItemByPurchaseRequestId(purchaseRequestId);
    }
}
