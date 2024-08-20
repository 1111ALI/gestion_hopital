package com.gestion_hopital.configurations;

import com.gestion_hopital.enums.Role;
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

    @PostConstruct
    public void init() {

        Optional<Users> users = usersRepository.findByEmail("ghopital@gmail.com");
        if (users.isEmpty()) {
            Users newUsers = new Users();
            newUsers.setEmail("ghopital@gmail.com");
            newUsers.setFullName("ghopital@gmail.com");
            newUsers.setPhoneNumber(655037336);
            newUsers.setPassword(passwordEncoder.encode("ghopital@gmail.com"));
            newUsers.setConfirmationPassword(passwordEncoder.encode("ghopital@gmail.com"));
            newUsers.setNumberConnexion(0);
            newUsers.setEnabled(true);
            newUsers.setConnected(false);
            newUsers.setRole(Set.of(Role.ADMIN));
            usersRepository.save(newUsers);
        }

    }
}
