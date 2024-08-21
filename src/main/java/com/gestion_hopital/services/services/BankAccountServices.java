package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.BankAccountRepository;
import com.gestion_hopital.services.interfaces.BankAccountInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankAccountServices implements BankAccountInterfaces {
    private final BankAccountRepository bankAccountRepository;
}
