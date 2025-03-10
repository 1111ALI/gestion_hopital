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
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStore;
    private String refStore;
    private String name;
    private String responsibleName;
    private double balanceCredit;
    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="storeEntrepriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    private String users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StoreCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StoreRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StoreCityId",referencedColumnName = "idCity")
    private City city;

}
