package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.InvoiceRepository;
import com.gestion_hopital.services.interfaces.InvoiceInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceServices implements InvoiceInterfaces {
    private final InvoiceRepository invoiceRepository;
}
