package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.SellingServiceRepository;
import com.gestion_hopital.services.interfaces.SellingServiceInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellingServiceService implements SellingServiceInterfaces {
    private final SellingServiceRepository sellingServiceRepository;
}
