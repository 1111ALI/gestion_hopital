package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.MvtBankRepository;
import com.gestion_hopital.services.interfaces.MvtBankInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MvtBankServices implements MvtBankInterfaces {
    private final MvtBankRepository mvtBankRepository;
}
