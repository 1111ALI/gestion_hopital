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
@Table(name = "habilitation")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRole;
    private String nomRole;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RoleUserId",referencedColumnName = "idUser")
    private Users users;
}
