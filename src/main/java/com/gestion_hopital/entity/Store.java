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
@Table(name = "magasin")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStore;
    private String refMagasin;
    private String name;
    private String responsibleName;
    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="storeEntrepriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StoreUserId",referencedColumnName = "idUser")
    private Users users;
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
