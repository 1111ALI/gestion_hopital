package com.gestion_hopital.repository;

import com.gestion_hopital.entity.Profit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfitRepository extends JpaRepository<Profit,Integer> {
}
