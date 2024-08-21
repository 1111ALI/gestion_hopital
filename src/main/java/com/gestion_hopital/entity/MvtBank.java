package com.gestion_hopital.entity;

import com.gestion_hopital.enums.StatusOfOperation;
import com.gestion_hopital.enums.TypeBank;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mvtBank")
public class MvtBank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMvtBank;
    private LocalDate MvtBankDate;
    private String refOperationBank;
    private TypeBank typeBank;
    private String motif;
    private double balanceBefore;
    private double amount;
    private double balanceAfter;
    private double fee;
    private StatusOfOperation statusOfOperation;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankId",referencedColumnName = "idBank")
    private Bank bank;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtCashUsersId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MvtBankEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
}
