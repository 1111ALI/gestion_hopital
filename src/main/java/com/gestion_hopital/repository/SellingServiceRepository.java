package com.gestion_hopital.repository;

import com.gestion_hopital.entity.SellingService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingServiceRepository extends JpaRepository<SellingService,Integer> {
}
