package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
    ADMIN("Administratrur"),
    CAISSIER ("Caissier"),
    COMPTABLE_MATIERE ("Comptable matière"),
    COMPTABLE ("Comptable"),
    TRESORIER ("Trésorier");

     private final String nameRole;


}
