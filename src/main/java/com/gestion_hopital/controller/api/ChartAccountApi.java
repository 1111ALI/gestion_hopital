package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.ChartOfAccountsInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chart-account/")
@RequiredArgsConstructor
public class ChartAccountApi {
    private final ChartOfAccountsInterfaces chartOfAccountsInterfaces;
}
