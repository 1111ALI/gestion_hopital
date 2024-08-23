package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
    ADMIN("Administratrur"),
    CASHIER ("Caissier"),
    MATERIAL_ACCOUNTANT ("Comptable matière"),
    ACCOUNTANT("Comptable"),
    TREASURER ("Trésorier");

     private final String roleName;


}
