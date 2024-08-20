package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "client")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idClient;
    private String refClient;
    private String name;
    private String adresse;
    private int phoneNumber;
    private String email;
    private double depot;
    private double retrait;
    private double solde;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustomerUserId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CustomerEntrepriseId",referencedColumnName = "idEntreprise")
    private Enterprise enterprise;
}
