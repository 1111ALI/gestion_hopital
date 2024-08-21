package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.RegionRepository;
import com.gestion_hopital.services.interfaces.RegionInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionServices implements RegionInterfaces{
    private final RegionRepository regionRepository;
}
