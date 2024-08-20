package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.CustomerRepository;
import com.gestion_hopital.services.interfaces.CustomerInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServices implements CustomerInterfaces {
    private final CustomerRepository customerRepository;
}
