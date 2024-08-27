package com.gestion_hopital.controller.api;

import com.gestion_hopital.dto.CountryDto;
import com.gestion_hopital.entity.Country;
import com.gestion_hopital.services.interfaces.CountryInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/country/")
@RequiredArgsConstructor
public class CountryApi {
    private final CountryInterfaces countryInterfaces;

    public Map<String,String> createCountry(@RequestBody CountryDto countryDto){
        return countryInterfaces.createCountry(countryDto);
    }
}
