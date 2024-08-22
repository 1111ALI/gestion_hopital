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
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name="productId"),
    inverseJoinColumns = @JoinColumn(name="supplierId"))
    private Set<Supplier> suppliers;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pruductPurchaseId",referencedColumnName = "idPurchase")
    private Purchase purchase;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pruductSaleId",referencedColumnName = "idSale")
    private Sale sale;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="produictInvoiceId",referencedColumnName = "idInvoice")
    private Invoice invoice;

}
