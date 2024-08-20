package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.StoreRepository;
import com.gestion_hopital.services.interfaces.StoreInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreServices implements StoreInterfaces {
    private final StoreRepository storeRepository;

}
