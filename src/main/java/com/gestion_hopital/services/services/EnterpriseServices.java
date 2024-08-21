package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.EnterpriseRepository;
import com.gestion_hopital.services.interfaces.EnterpriseInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnterpriseServices implements EnterpriseInterfaces {
    private final EnterpriseRepository enterpriseRepository;
}
