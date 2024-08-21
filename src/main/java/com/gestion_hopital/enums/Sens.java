package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Sens {
    ENCAISSEMENT("Encaissment"),
    DECAISSEMENT("Décaissements");

    private final String sensOperation;
}
