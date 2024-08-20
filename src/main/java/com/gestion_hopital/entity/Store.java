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
@Table(name = "magasin")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMagasin;
    private String refMagasin;
    private String name;
    private String responsibleName;
    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL)
    private Set<Product> products;
    @ManyToOne(cascade = CascadeType.ALL)
    private Enterprise enterprise;

}
