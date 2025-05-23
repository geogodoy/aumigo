package com.geogodoy.aumigo.domain.repository;

import com.geogodoy.aumigo.domain.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository  extends JpaRepository<Organization, Long> {

    @Query("SELECT o.id FROM Organization o WHERE o.active = true")
    List<Long> findAllByActiveTrue();
}
