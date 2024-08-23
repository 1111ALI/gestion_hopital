package com.gestion_hopital.entity;

import com.gestion_hopital.enums.PaymentMethod;
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
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSale;
    private String refSale;
    private LocalDate saleDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saleSupplierId",referencedColumnName = "idCustomer")
    private Customer customer;
    @OneToMany(mappedBy = "sale",cascade = CascadeType.ALL)
    private Set<Product> products;
    private PaymentMethod paymentMethod;
    private double quantity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="saleProfitId",referencedColumnName = "idProfit")
    private Profit profit;
    private double SellingPrice;
    private String lotSale;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saleUserId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SaleAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SaleCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SaleeRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SaleEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SaleCountryId",referencedColumnName = "idCountry")
    private Country country;
}
