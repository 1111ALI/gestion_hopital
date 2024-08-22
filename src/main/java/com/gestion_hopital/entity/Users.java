package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "utilisateur")
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String email;
    private String fullName;
    private int phoneNumber;
    private String password;
    private String confirmationPassword;
    private int numberConnexion;
    private boolean isEnabled;
    private boolean isConnected;
    @ElementCollection
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
    private Agency agencys;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Bank> banks;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<BankAccount> bankAccounts;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<ChartOfAccounts> chartOfAccounts;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<City> citys;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "idCustomer")
    private Customer customer;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<MobileMoney> mobileMonies;
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




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.stream()
                .map(role1 -> new SimpleGrantedAuthority(role1.name()))
                .collect(Collectors.toSet());
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
