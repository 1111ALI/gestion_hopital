package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.SaleInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sale/")
@RequiredArgsConstructor
public class SaleApi {
    private final SaleInterface saleInterface;
}
