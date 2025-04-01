package com.geogodoy.aumigo.service;

import com.geogodoy.aumigo.domain.model.Organization;

import java.util.List;

public interface OrganizationService {

    Organization saveOrganization(Organization organization);

    Organization getOrganizationById(Long id);

    List<Organization> getAll();

    List<Long> getAllActive();

    int countAnimalsByOrganization(Long id);

    void deleteOrganization(Long id);
}
