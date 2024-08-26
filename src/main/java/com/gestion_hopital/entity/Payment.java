package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPayment;
    private String refPayment;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="regulationCustomerId",referencedColumnName = "idCustomer")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="paymentInvoiceId",referencedColumnName = "idInvoice")
    private Invoice invoice;
    private double amount;
    private double balanceCredit;
    private String users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymenteRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentCountryId",referencedColumnName = "idCountry")
    private Country country;
}
