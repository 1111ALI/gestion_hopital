package com.gestion_hopital.services.services;

import com.gestion_hopital.services.interfaces.UsersInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServices implements UsersInterfaces {
    private final UsersInterfaces usersInterfaces;
}
