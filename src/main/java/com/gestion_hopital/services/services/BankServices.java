package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.BankRepository;
import com.gestion_hopital.services.interfaces.BankInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServices implements BankInterfaces {
    private final BankRepository bankRepository;
}
