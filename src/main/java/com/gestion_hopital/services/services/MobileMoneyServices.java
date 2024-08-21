package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.MobileMoneyRepository;
import com.gestion_hopital.services.interfaces.MobileMoneyInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileMoneyServices implements MobileMoneyInterfaces {
    private final MobileMoneyRepository mobileMoneyRepository;
}
