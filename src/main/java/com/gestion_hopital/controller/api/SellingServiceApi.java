package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.SellingServiceInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/selling-service/")
@RequiredArgsConstructor
public class SellingServiceApi {
    private final SellingServiceInterfaces sellingServiceInterfaces;
}
