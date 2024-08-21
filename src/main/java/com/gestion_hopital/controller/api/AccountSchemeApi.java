package com.gestion_hopital.controller.api;

import com.gestion_hopital.services.interfaces.AccountSchemeInterfaces;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account-scheme/")
@RequiredArgsConstructor
public class AccountSchemeApi {
    private final AccountSchemeInterfaces accountSchemeInterfaces;
}
