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
    @OneToMany(mappedBy = "entreprise",cascade = CascadeType.ALL)
    private Set<Users> users;
    @OneToMany(mappedBy = "entreprise",cascade = CascadeType.ALL)
    private Set<Customer> customers;
    @OneToMany(mappedBy = "entreprise",cascade = CascadeType.ALL)
    private Set<Store> stores;
    @OneToMany(mappedBy = "entreprise",cascade = CascadeType.ALL)
    private Set<Product> products;
}
