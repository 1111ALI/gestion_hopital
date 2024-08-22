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
@Table(name = "facture")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInvoice;
    private String refInvoice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="invoiceCustomerId",referencedColumnName = "idCustomer")
    private Customer customer;
    private String motif;
    @OneToMany(mappedBy = "invoice",cascade = CascadeType.ALL)
    private Set<Product> products;
    private double amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceEnterpriceId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="InvoiceUserId",referencedColumnName = "idUser")
    private Users users;
    @OneToMany(mappedBy = "invoice",cascade = CascadeType.ALL)
    private Set<Payment> payments;
}
