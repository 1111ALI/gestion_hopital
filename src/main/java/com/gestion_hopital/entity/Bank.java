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
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBank;
    private String refBank;
    private String name;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankCountryId",referencedColumnName = "idCountry")
    private Country country;
    @OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    private Set<BankAccount> bankAccounts;
    @OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    private Set<MvtBank> mvtBanks;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankUserd",referencedColumnName = "idUser")
    private Users users;
}
