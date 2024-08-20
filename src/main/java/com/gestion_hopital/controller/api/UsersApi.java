package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.UsersInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users/")
@RequiredArgsConstructor
public class UsersApi {
    private final UsersInterfaces usersInterfaces;
}
