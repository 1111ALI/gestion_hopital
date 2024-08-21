package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.MvtCashRepository;
import com.gestion_hopital.services.interfaces.MvtCashInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MvtCashServices implements MvtCashInterfaces {
    private final MvtCashRepository mvtCashRepository;
}
