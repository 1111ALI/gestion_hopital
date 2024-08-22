package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

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
    private int idCustomer;
    private String refClient;
    private String name;
    private String adresse;
    private int phoneNumber;
    private String email;
    private double depot;
    private double retrait;
    private double solde;
    private double balanceCredit;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CustomerEntrepriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerCityId",referencedColumnName = "idCity")
    private City city;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Sale> sales;
}
