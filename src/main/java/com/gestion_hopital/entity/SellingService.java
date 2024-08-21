package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "serviceVendu")
public class SellingService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idService;
    private String nom;
    private String description;
    private double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="serviceUserId",referencedColumnName = "idUser")
    private Users users;
    @ManyToOne
    @JoinColumn(name="serviceEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
}
