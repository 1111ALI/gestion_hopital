package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "compteBancaire")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBkAccount;
    private String bankAccountNumber;
    private double balance;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bankAccountId",referencedColumnName = "idBank")
    private Bank bank;
}
