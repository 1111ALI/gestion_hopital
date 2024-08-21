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
@Table(name = "planComptable")
public class ChartOfAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idChart;
    private String account;
    private String nameAccount;
    @ManyToMany(mappedBy = "chartOfAccountsDebit",cascade = CascadeType.ALL)
    private Set<AccountScheme> accountSchemeDebit;
    @ManyToMany(mappedBy = "chartOfAccountsCredit",cascade = CascadeType.ALL)
    private Set<AccountScheme> accountSchemeCredit;

}
