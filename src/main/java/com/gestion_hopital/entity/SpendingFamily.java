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
public class SpendingFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFamily;
    private String refFamily;
    private String name;
    private double balance;
    private double balanceCredit;
    @OneToMany(mappedBy = "spendingFamily",cascade = CascadeType.ALL)
    private Set<Spent> expenses;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "familysUserId",referencedColumnName = "idUser")
    private Users users;
}
