package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "operateurMomo")
public class OperateurMomo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOpMomo;
    private String name;
}
