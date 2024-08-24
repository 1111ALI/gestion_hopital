package com.gestion_hopital.configurations;

import com.gestion_hopital.entity.Role;
import com.gestion_hopital.entity.Users;
import com.gestion_hopital.repository.RoleRepository;
import com.gestion_hopital.repository.UsersRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;
import java.util.Set;


@Configuration
@RequiredArgsConstructor
public class DataInitialize {

    private final PasswordEncoder passwordEncoder;
    private final UsersRepository usersRepository;
    private final RoleRepository roleRepository;

    @PostConstruct
    public void init() {
Optional<Role> existingRoleADMIN=roleRepository.findByRole("ADMIN");
if(existingRoleADMIN.isEmpty()){
    Role newRole=new Role();
    newRole.setRole("ADMIN");
    roleRepository.save(newRole);
}

        Role roleAdmin=roleRepository.findByRole("ADMIN").orElseThrow(()->new RuntimeException("Role introuvable"));
        Optional<Users> users = usersRepository.findByUsername("ghopital@gmail.com");
        if (users.isEmpty()) {
            Users newUsers = new Users();
            newUsers.setUsername("ghopital@gmail.com");
            newUsers.setFullName("ghopital@gmail.com");
            newUsers.setPhoneNumber(655037336);
            newUsers.setPassword(passwordEncoder.encode("ghopital@gmail.com"));
            newUsers.setConfirmationPassword(passwordEncoder.encode("ghopital@gmail.com"));
            newUsers.setNumberConnexion(0);
            newUsers.setEnabled(true);
            newUsers.setConnected(false);
            newUsers.setRole(roleAdmin);
            usersRepository.save(newUsers);

        }

    }
}
