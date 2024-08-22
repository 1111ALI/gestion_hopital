package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mobileMoney")
public class MobileMoney {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMomo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="OperateurMomoId",referencedColumnName = "idOpMomo")
    private OperateurMomo operateurMomo;
    private double balance;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="momoUserId",referencedColumnName = "idUser")
    private Users users;
}
