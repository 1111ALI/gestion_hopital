package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.CountryRepository;
import com.gestion_hopital.services.interfaces.CountryInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService implements CountryInterfaces {
    private final CountryRepository countryRepository;
}
