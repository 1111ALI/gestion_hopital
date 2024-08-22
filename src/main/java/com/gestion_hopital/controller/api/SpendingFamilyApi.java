package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.SpendingFamilyInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spending-family/")
@RequiredArgsConstructor
public class SpendingFamilyApi {
    private final SpendingFamilyInterfaces spendingFamilyInterfaces;
}
