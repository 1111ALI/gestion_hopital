package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.ProductInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product/")
@RequiredArgsConstructor
public class ProductApi {
    private final ProductInterfaces productInterfaces;
}
