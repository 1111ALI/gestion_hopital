package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Category {
    FOURNITURE ("Fournitures"),
    PRODUITS_PHARMACEUTIQUES ("Produits pharmaceutiques");

    private final String nameCategory;


}
