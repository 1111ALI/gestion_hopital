package com.gestion_hopital.repository;

import com.gestion_hopital.entity.SpendingFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingFamilyRepository extends JpaRepository<SpendingFamily,Integer> {
}
