package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.MvtStockRepository;
import com.gestion_hopital.services.interfaces.MvtStockInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MvtStockServices implements MvtStockInterfaces {
    private final MvtStockRepository mvtStockRepository;
}
