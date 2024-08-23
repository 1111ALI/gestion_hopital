package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperateurMomo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOpMomo;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="momoOpUserId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="momoOpCountryId",referencedColumnName = "idCountry")
    private Country country;
}
