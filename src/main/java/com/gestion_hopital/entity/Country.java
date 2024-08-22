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
@Table(name = "pays")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCountry;
    private String refCountry;
    private String name;
    private String iso;
    private double balanceCredit;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<Customer> customers;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<Enterprise> enterprises;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashes;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<Region> regions;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<SellingService> sellingServices;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<Store> stores;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<City> citys;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtBanks;
    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
    private Set<Users> users;

}
