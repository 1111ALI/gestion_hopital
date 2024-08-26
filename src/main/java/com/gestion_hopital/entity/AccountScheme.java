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
public class AccountScheme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAccountScheme;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name="accountDebitId"),
    inverseJoinColumns = @JoinColumn(name="schemeDebitId"))
    private Set<ChartOfAccounts> chartOfAccountsDebit;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name="accountCreditId"),
            inverseJoinColumns = @JoinColumn(name="schemeCreditId"))
    private Set<ChartOfAccounts> chartOfAccountsCredit;
    private String nameUsers;
}
