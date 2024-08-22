package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.ProfitInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profit/")
@RequiredArgsConstructor
public class ProfitApi {
    private final ProfitInterfaces profitInterfaces;

}
