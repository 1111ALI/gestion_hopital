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
@Table(name = "ville")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCity;
    private String refCity;
    private String name;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CityRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CityCountryId",referencedColumnName = "idCountry")
    private Country country;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Cash> cashes;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Customer> customers;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Enterprise> enterprises;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashes;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Store> stores;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Agency> agencies;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<Bank> banks;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtBanks;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityUserd",referencedColumnName = "idUser")
    private Users users;

}
