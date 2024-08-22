package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.ProfitRepository;
import com.gestion_hopital.services.interfaces.ProfitInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfitServices implements ProfitInterfaces {
    private final ProfitRepository profitRepository;
}
