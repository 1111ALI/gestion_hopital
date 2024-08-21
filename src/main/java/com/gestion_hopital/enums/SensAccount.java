package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SensAccount {
    DEBIT ("Débit"),
    CREDIT ("Crédit");

    private final String sensAccount;
}
