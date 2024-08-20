package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.EntrepriseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/entreprise/")
@RequiredArgsConstructor
public class EnterpriseApi {
    private final EntrepriseInterfaces entrepriseInterfaces;
}
