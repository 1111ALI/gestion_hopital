package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TypeBank {
    DEPOT("Dépôt"),
    RETRAIT("Retrait");

    private final String typeBank;
}
