package com.chemco.purchaserequestservice.service;

import com.chemco.purchaserequestservice.entity.PurchaseRequest;
import com.chemco.purchaserequestservice.repository.PurchaseRequestRepo;
import com.chemco.purchaserequestservice.template.Item;
import com.chemco.purchaserequestservice.template.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class PurchaseRequestService {

    @Autowired
    public PurchaseRequestRepo purchaseRequestRepo;

    @Autowired
    private RestTemplate resTemplate;

    public PurchaseRequest findByPurchaseRequestId(Long purchaseRequestId) {
        return purchaseRequestRepo.findByPurchaseRequestId(purchaseRequestId);
    }

    public PurchaseRequest save(PurchaseRequest purchaseRequest) {
        return purchaseRequestRepo.save(purchaseRequest);
    }

    public ResponseTemplate getItemByPurchaseRequestId(Long purchaseRequestId) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        PurchaseRequest purchaseRequest = purchaseRequestRepo.findByPurchaseRequestId(purchaseRequestId);
        Item item =
                resTemplate.getForObject("http://Item-Service/item/" + 2, Item.class);
        responseTemplate.setPurchaseRequest(purchaseRequest);
        responseTemplate.setItem(item);
        return responseTemplate;
    }
}
