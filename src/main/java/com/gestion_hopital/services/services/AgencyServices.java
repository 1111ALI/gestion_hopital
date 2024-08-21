package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.AgencyRepository;
import com.gestion_hopital.services.interfaces.AgencyInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgencyServices implements AgencyInterfaces {
    private final AgencyRepository agencyRepository;
}
