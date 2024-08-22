package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.PurchaseRepository;
import com.gestion_hopital.services.interfaces.PurchaseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseSevices implements PurchaseInterfaces {
    private final PurchaseRepository purchaseRepository;
}
