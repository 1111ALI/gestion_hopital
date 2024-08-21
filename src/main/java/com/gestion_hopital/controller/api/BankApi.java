package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.BankInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
@RequiredArgsConstructor
public class BankApi {
    private final BankInterfaces bankInterfaces;
}
