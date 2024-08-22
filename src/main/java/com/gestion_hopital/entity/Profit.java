package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "benefice")
public class Profit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProfit;
    private LocalDate OperationDate;
    private double montant;
    @OneToOne(mappedBy = "profit",cascade = CascadeType.ALL)
    private Sale sale;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitUserId",referencedColumnName = "idUser")
    private Users users;
}
