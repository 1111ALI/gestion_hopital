package com.gestion_hopital.repository;

import com.gestion_hopital.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {
}
