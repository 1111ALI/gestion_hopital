package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.CustomerInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer/")
@RequiredArgsConstructor
public class CustomerApi {
    private final CustomerInterfaces customerInterfaces;
}
