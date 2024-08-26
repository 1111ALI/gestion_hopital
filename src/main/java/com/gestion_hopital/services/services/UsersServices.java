package com.gestion_hopital.services.services;


import com.gestion_hopital.entity.Users;
import com.gestion_hopital.repository.UsersRepository;
import com.gestion_hopital.services.interfaces.UsersInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UsersServices implements UsersInterfaces {
    private final UsersRepository usersRepository;

}
