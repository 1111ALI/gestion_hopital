package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Category;
import jakarta.persistence.*;
import lombok.*;

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
    @JoinColumn(name = "productMagasinId",referencedColumnName = "idMagasin")
    private Store store;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
}
