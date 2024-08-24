package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.RoleInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role/")
@RequiredArgsConstructor
public class RoleApi {
    private final RoleInterfaces roleInterfaces;
}
