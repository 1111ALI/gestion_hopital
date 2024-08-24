package com.gestion_hopital.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTask;
    private String name;
    private boolean isEnabled;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taskRole",referencedColumnName = "idRole")
    private Role role;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taskUser",referencedColumnName = "idUser")
    private Users users;
}
