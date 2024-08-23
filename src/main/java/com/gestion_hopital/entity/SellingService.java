package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellingService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idService;
    private String nom;
    private String description;
    private double price;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="serviceUserId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="serviceEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="serviceCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="SellingServiceProduct",
            joinColumns = @JoinColumn(name = "sellingServiceId"),
            inverseJoinColumns = @JoinColumn(name="productId"))
    private Set<Product> products=new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="accountServiceId",referencedColumnName = "idAccountScheme")
    private AccountScheme accountScheme;

}
