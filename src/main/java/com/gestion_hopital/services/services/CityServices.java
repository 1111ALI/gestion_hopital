package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.CityRepository;
import com.gestion_hopital.services.interfaces.CityInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServices {
    private final CityRepository cityRepository;
}
