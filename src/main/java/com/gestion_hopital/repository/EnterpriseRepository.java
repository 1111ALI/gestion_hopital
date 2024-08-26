package com.gestion_hopital.repository;

import com.gestion_hopital.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Integer> {

    Optional<Enterprise> findByName(String name);
}
