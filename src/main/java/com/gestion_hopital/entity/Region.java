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
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRegion;
    private String refRegion;
    private String name;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="regionCountryId",referencedColumnName = "idCountry")
    private Country country;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<Enterprise> enterprises;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<Customer> customers;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashes;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<Users> users;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<City> citys;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<Agency> agencies;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<Bank> banks;
    @OneToMany(mappedBy = "region",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtBanks;

}
