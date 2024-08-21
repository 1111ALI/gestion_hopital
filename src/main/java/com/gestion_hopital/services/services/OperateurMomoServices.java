package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.OperateurMomoRepository;
import com.gestion_hopital.services.interfaces.OperateurMomoInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OperateurMomoServices implements OperateurMomoInterfaces {
    private final OperateurMomoRepository operateurMomoRepository;
}
