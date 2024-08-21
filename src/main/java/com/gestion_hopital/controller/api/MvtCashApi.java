package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.MvtCashInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mvt-cash/")
@RequiredArgsConstructor
public class MvtCashApi {
    private final MvtCashInterfaces mvtCashInterfaces;
}
