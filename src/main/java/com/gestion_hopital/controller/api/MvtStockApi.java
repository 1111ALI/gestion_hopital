package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.MvtStockInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mvt-stock/")
@RequiredArgsConstructor
public class MvtStockApi {
    private final MvtStockInterfaces mvtStockInterfaces;
}
