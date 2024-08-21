package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.RegionInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/region/")
@RequiredArgsConstructor
public class RegionApi {
    private final RegionInterfaces regionInterfaces;
}
