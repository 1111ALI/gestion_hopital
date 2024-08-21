package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.MvtCashInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mvt-bank/")
@RequiredArgsConstructor
public class MvtBankApi {
    private final MvtCashInterfaces mvtCashInterfaces;

}
