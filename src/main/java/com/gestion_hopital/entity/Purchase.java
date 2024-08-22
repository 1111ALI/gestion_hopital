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
@Table(name = "achat")
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
}
