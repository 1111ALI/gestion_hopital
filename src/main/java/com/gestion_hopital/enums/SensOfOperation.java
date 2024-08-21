package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SensOfOperation {
    ENCAISSEMENT("Encaissment"),
    DECAISSEMENT("Décaissements");

    private final String sensOperation;
}
