package com.gestion_hopital.entity;

import com.gestion_hopital.enums.SensOfOperation;
import com.gestion_hopital.enums.StatusOfOperation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mvtCash")
public class MvtCash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMvtCash;
    private LocalDate MvtCashDate;
    private String refOperationCash;
    private String type;
    private String motif;
    private SensOfOperation sens;
    private double balanceBefore;
    private double amount;
    private double fee;
    private double VAT;
    private double discount;
    private double balanceAfter;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MvtCashId",referencedColumnName = "idCash")
    private Cash cash;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashCountry",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashRegion",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashUsersId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
}
