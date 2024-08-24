package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.RoleRepository;
import com.gestion_hopital.services.interfaces.RoleInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServices implements RoleInterfaces {
    private final RoleRepository roleRepository;
}
