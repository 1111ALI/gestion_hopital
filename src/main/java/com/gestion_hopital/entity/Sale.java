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
@Table(name = "vente")
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
}
