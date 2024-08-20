package com.gestion_hopital.configurations;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@RequiredArgsConstructor
public class DataInitialize {

    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void init(){

    }
}
