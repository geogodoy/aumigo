package com.geogodoy.aumigo.domain.repository;

import com.geogodoy.aumigo.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

