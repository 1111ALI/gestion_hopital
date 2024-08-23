package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MvtStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMvtStock;
    private LocalDate MvtDate;
    private String idOperation;
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtProductId",referencedColumnName = "idProduct")
    private Product product;
    private double InitialStock;
    private double incomingQuantity;
    private double outgoingQuantity;
    private double finalStock;
    private double valueStock;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtUsersId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtStoreId",referencedColumnName = "idStore")
    private Store store;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtStockCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtStockRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mvtStockCityId",referencedColumnName = "idCity")
    private City city;
}
