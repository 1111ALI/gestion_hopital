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
        Users users=usersRepository.findByEmail(username).orElseThrow(()->new RuntimeException("Utilisateur introuvable"));
       if(users.isConnected()){
           throw new UsernameNotFoundException("Utilisateur déjà connecté");
       }
       users.setNumberConnexion(users.getNumberConnexion()+1);
       usersRepository.save(users);
        return new User(users.getUsername(),users.getPassword(),users.getRole().stream()
                .map(role -> new SimpleGrantedAuthority(role.name()))
                .collect(Collectors.toSet()));
    }
}
