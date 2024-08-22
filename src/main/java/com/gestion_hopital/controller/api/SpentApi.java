package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.SpentInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spent/")
@RequiredArgsConstructor
public class SpentApi {
    private final SpentInterfaces spentInterfaces;
}
