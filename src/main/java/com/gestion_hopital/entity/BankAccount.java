package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBkAccount;
    private String bankAccountNumber;
    private double balance;
    private double balanceCredit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bankAccountId",referencedColumnName = "idBank")
    private Bank bank;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankAccountUserd",referencedColumnName = "idUser")
    private Users users;
}
