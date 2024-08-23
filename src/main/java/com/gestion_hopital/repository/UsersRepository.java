package com.gestion_hopital.repository;

import com.gestion_hopital.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByUsername(String username);
}
