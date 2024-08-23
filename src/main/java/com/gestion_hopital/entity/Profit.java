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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profitCountryId",referencedColumnName = "idCountry")
    private Country country;
}
