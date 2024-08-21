package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.CashInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cash/")
@RequiredArgsConstructor
public class CashApi {
    private final CashInterfaces cashInterfaces;
}
