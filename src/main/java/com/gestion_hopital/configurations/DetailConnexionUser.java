package com.gestion_hopital.configurations;

import com.gestion_hopital.entity.Users;
import com.gestion_hopital.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DetailConnexionUser implements UserDetailsService {
    private final UsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users existingUser=usersRepository.findByUsername(username).orElseThrow(()->new RuntimeException("Utilisateur introuvable"));
        if(!existingUser.isEnabled()){
            throw new UsernameNotFoundException("Utilisateur inactif");
        }

        existingUser.setNumberConnexion(existingUser.getNumberConnexion()+1);
       usersRepository.save(existingUser);
        return new User(existingUser.getUsername(),existingUser.getPassword(),existingUser.getRole().stream()
                .map(role -> new SimpleGrantedAuthority(role.name()))
                .collect(Collectors.toSet()));
    }
}
