package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.BankAccountInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank-account/")
@RequiredArgsConstructor
public class BankAccountApi {
    private final BankAccountInterfaces bankAccountInterfaces;
}
