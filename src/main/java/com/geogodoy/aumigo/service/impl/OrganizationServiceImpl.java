package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.Organization;
import com.geogodoy.aumigo.domain.repository.AnimalRepository;
import com.geogodoy.aumigo.domain.repository.OrganizationRepository;
import com.geogodoy.aumigo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    private AnimalRepository animalRepository;

    public Organization saveOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization getOrganizationById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }

    @Override
    public List<Long> getAllActive() {
        return organizationRepository.findAllByActiveTrue();
    }

    @Override
    public int countAnimalsByOrganization(Long id) {
        return animalRepository.findAllByOrganizationId(id).size();
    }

    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}
