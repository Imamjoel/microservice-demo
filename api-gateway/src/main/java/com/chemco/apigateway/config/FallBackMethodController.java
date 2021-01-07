package com.chemco.apigateway.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController  {

    @GetMapping("itemServiceFallBack")
    public String itemServiceFallBackMethod() {
        return "item service is longer " +
                "please try again later";
    }

    @GetMapping("purchaseRequestServiceFallBack")
    public String purchaseRequestFallBackMethod() {
        return "purchaseRequest service is longer " +
                "please try again later";
    }
}
