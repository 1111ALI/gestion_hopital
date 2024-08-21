package com.gestion_hopital.services.services;

import com.gestion_hopital.repository.AccountSchemeRepository;
import com.gestion_hopital.services.interfaces.AccountSchemeInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountSchemeServices implements AccountSchemeInterfaces {
    private final AccountSchemeRepository accountSchemeRepository;
}
