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
@Table(name = "fournisseur")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSupplier;
    private String name;
    private String email;
    private String numberPhone;
    private String adresse;
    private String pointFocal;
    private double balanceCredit;
    @ManyToMany(mappedBy = "suppliers",cascade = CascadeType.ALL)
    private Set<Product> products=new HashSet<>();
    @OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
    private Set<Purchase> purchases;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplierUserId",referencedColumnName = "idUser")
    private Users users;
}
