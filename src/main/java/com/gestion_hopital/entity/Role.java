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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRole;
    private String role;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            joinColumns = @JoinColumn(name="roleId"),
            inverseJoinColumns = @JoinColumn(name="UserId")
    )
    private Set<Users> users;
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private Set<Task> tasks;
}
