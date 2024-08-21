package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PaymentMethod {
    ESPECES("En espèces"),
    VIREMENT("Virement"),
    CHEQUE("Chèque"),
    MOBILE_MONEY("Mobile Money"),
    A_CREDIT("A crédit");

    private final String paymentMethod;
}
