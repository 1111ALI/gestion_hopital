package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.ChartOfAccountsRepository;
import com.gestion_hopital.services.interfaces.ChartOfAccountsInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChartOfAccountsServices implements ChartOfAccountsInterfaces {
    private final ChartOfAccountsRepository chartOfAccountsRepository;
}
