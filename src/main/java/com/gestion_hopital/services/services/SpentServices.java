package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.SpentRepository;
import com.gestion_hopital.services.interfaces.SpentInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpentServices implements SpentInterfaces {
    private final SpentRepository spentRepository;
}
