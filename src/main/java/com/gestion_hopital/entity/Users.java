package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "utilisateur")
public class Users implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String email;
    private String fullName;
    private int phoneNumber;
    private String password;
    private String confirmationPassword;
    private int numberConnexion;
    private boolean isEnabled;
    private boolean isConnected;
    @ElementCollection
    private Set<Role> role;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="UserEntrepriseId",referencedColumnName = "idEntreprise")
    private Entreprise entreprise;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.stream()
                .map(role1 -> new SimpleGrantedAuthority(role1.name()))
                .collect(Collectors.toSet());
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
