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
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEntreprise;
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
}
