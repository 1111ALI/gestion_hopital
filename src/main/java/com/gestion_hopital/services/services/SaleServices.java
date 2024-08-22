package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.SaleRepository;
import com.gestion_hopital.services.interfaces.SaleInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleServices implements SaleInterface {
    private final SaleRepository saleRepository;
}
