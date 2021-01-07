package com.chemco.purchaserequestservice.repository;

import com.chemco.purchaserequestservice.entity.PurchaseRequest;
import com.chemco.purchaserequestservice.service.PurchaseRequestService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRequestRepo extends JpaRepository<PurchaseRequest, Long> {
    PurchaseRequest findByPurchaseRequestId(Long purchaseRequestId);
}
