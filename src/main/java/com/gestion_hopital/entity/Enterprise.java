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
@Table(name = "entreprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEnterprise;
    private String name;
    private String email;
    private int phoneNumber;
    private String slogan;
    private int mailbox;
    private String uniqueIdentificationNumber;
    private String fileName;
    private String fileType;
    private double balanceCredit;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Users> users;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Customer> customers;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Store> stores;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Product> products;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<SellingService> sellingServices;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Cash> cashs;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EnterpriseCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EnterpriseRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EnterpriseCityId",referencedColumnName = "idCity")
    private City city;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Agency> agencies;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<MvtBank> mvtBanks;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashes;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Invoice> invoices;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Profit> profits;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Purchase> purchases;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Sale> sales;
    @OneToMany(mappedBy = "enterprise",cascade = CascadeType.ALL)
    private Set<Payment> payments;
}
