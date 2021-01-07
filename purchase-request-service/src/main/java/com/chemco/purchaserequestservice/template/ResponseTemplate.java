package com.chemco.purchaserequestservice.template;

import com.chemco.purchaserequestservice.entity.PurchaseRequest;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    @Setter private PurchaseRequest purchaseRequest;
    @Setter private Item item;

}
