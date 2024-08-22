package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.SpendingFamilyRepository;
import com.gestion_hopital.services.interfaces.SpendingFamilyInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpendingFamilyServices implements SpendingFamilyInterfaces {
    private final SpendingFamilyRepository spendingFamilyRepository;
}
