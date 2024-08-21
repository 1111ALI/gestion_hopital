package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.OperateurMomoInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/operateur-momo/")
@RequiredArgsConstructor
public class OperateurMomoApi {
    private final OperateurMomoInterfaces operateurMomoInterfaces;
}
