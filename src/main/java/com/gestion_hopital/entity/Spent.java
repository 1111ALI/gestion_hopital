package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "depense")
public class Spent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSpent;
    private String refSpent;
    private String name;
    private double balance;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="spentFamilyId",referencedColumnName = "idFamily")
    private SpendingFamily spendingFamily;

}
