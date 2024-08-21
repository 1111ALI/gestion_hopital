package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.security.Provider;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "produit")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduct;
    private String refProduct;
    private String name;
    private Category category;
    private double purchasePrice;
    private double sellingPrice;
    private double unitCost;
    private double finalStock;
    private double finalValue;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productMagasinId",referencedColumnName = "idStore")
    private Store store;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productUserId",referencedColumnName = "idUser")
    private Users users;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private Set<MvtStock> mvtStocks;
    @ManyToMany(mappedBy = "products")
    private Set<SellingService> sellingServices=new HashSet<>();


}
