package com.gestion_hopital.repository;

import com.gestion_hopital.entity.ChartOfAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChartOfAccountsRepository extends JpaRepository<ChartOfAccounts,Integer> {
}
