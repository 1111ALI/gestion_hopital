package com.gestion_hopital.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StatusOfOperation {
    SORTIE_STOCK("Sortie du stock"),
    ENTREE_STOCK("Entrée en stock"),
    VENDU("Vendu"),
    ANNULE("Annulé"),
    REMBOURSE("Remboursé"),
    VIRE("Viré"),
    DEPOSE("Déposé"),
    RETIRE("Retiré");

    private final String statusOperation;
}
