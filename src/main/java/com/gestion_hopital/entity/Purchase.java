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
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPurchase;
    private String refPurchase;
    private LocalDate purchaseDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseSupplierId",referencedColumnName = "idSupplier")
    private Supplier supplier;
    @OneToMany(mappedBy = "purchase",cascade = CascadeType.ALL)
    private Set<Product> products;
    private PaymentMethod paymentMethod;
    private double quantity;
    private double purchasePrice;
    private String lotPurchase;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseUserId",referencedColumnName = "idUser")
    private Users users;
}
