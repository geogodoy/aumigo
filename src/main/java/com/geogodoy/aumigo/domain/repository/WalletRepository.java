package com.geogodoy.aumigo.domain.repository;

import com.geogodoy.aumigo.domain.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findByOrganizationId(Long organizationId);
}
