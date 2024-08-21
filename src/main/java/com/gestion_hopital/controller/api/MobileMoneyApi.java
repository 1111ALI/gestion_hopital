package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.MobileMoneyInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mobile-money/")
@RequiredArgsConstructor
public class MobileMoneyApi {
    private final MobileMoneyInterfaces mobileMoneyInterfaces;
}
