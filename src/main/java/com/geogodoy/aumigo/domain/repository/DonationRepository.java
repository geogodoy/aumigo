package com.geogodoy.aumigo.domain.repository;

import com.geogodoy.aumigo.domain.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByOrganizationId(Long organizationId);
}
