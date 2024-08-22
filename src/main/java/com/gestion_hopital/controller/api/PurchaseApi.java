package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.PurchaseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase/")
@RequiredArgsConstructor
public class PurchaseApi {
    private final PurchaseInterfaces purchaseInterfaces;
}
