package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.CountryInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/country/")
@RequiredArgsConstructor
public class CountryApi {
    private final CountryInterfaces country;
}
