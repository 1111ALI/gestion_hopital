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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String username;
    private String fullName;
    private int phoneNumber;
    private String password;
    private String confirmationPassword;
    private int numberConnexion;
    private boolean isEnabled;
    private boolean isConnected;
 @ManyToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Role> role;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserEntrepriseId", referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<Product> products;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<SellingService> sellingServices;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<Store> stores;
    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
    private Cash cash;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserCountryId", referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserRegionId", referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserCityId", referencedColumnName = "idCity")
    private City city;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<MvtCash> mvtCashes;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<MvtBank> mvtBanks;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<AccountScheme> accountSchemes;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UsersAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Bank> banks;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<BankAccount> bankAccounts;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<ChartOfAccounts> chartOfAccounts;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
     private Set<Customer> customer;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<MobileMoney> mobileMoney;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<OperateurMomo> operateurMomos;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Profit> profits;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Sale> sales;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<SpendingFamily> spendingFamilies;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Supplier> suppliers;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Invoice> invoices;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Purchase> purchases;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Spent> spents;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Payment> payments;
   @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
   private Set<Task> tasks;

}
