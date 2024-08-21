package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.CashRepository;
import com.gestion_hopital.services.interfaces.CashInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashServices implements CashInterfaces {
    private final CashRepository cashRepository;
}
