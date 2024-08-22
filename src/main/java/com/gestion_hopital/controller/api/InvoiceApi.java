package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.InvoiceInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/invoice/")
@RequiredArgsConstructor
public class InvoiceApi {
    private final InvoiceInterfaces invoiceInterfaces;
}
