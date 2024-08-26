package com.gestion_hopital.entity;

import com.gestion_hopital.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String username;
    private String fullName;
    private String phoneNumber;
    private String password;
    private String confirmationPassword;
    private int numberConnexion;
    private boolean isEnabled;
    private boolean isConnected;
    private Set<Role> role;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userEnterpriseId",referencedColumnName = "idEnterprise")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userCountryId",referencedColumnName = "idCountry")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userRegionId",referencedColumnName = "idRegion")
    private Region region;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userCityId",referencedColumnName = "idCity")
    private City city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userAgencyId",referencedColumnName = "idAgency")
    private Agency agency;
    @OneToOne(mappedBy = "users",cascade = CascadeType.ALL)
    private Cash cash;


}
