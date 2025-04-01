package com.geogodoy.aumigo.domain.repository;

import com.geogodoy.aumigo.domain.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByOrganizationId(Long organizationId);

    Collection<Object> findAllByOrganizationId(Long id);
}
