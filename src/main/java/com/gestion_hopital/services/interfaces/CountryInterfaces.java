package com.gestion_hopital.services.interfaces;

import com.gestion_hopital.dto.CountryDto;

import java.util.Map;

public interface CountryInterfaces{

    Map<String, String> createCountry(CountryDto countryDto);
}
