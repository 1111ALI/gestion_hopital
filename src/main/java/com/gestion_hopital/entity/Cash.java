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
@Table(name = "caisse")
public class Cash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCash;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "CashUserId",referencedColumnName = "idUser")
    private Users users;
    private double balance;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CashEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CashRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CashCityId",referencedColumnName = "idCity")
    private City city;
    @OneToMany(mappedBy = "cash",cascade = CascadeType.ALL)
    private Set<MvtCash> mvtcashes;
}
