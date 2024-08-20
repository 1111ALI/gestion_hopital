package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.StoreInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/magasin/")
@RequiredArgsConstructor
public class StoreApi {
    private final StoreInterfaces storeInterfaces;
}
