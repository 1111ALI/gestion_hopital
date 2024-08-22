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
@Table(name = "agence")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAgency;
    private String refAgency;
    private String name;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="agencyCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="agencyRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="agencyenterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="agencyCountryId",referencedColumnName = "idCountry")
    private Country country;
    @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashs;
    @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtBanks;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Users> users;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Invoice> invoices;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Profit> profits;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Purchase> purchases;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Sale> sales;
   @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private Set<Payment> payments;
}
