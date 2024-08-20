package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.ProductRepository;
import com.gestion_hopital.services.interfaces.ProductInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServices implements ProductInterfaces{
    private final ProductRepository productRepository;
}
