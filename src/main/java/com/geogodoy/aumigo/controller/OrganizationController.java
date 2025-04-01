package com.geogodoy.aumigo.controller;


import com.geogodoy.aumigo.domain.model.Organization;
import com.geogodoy.aumigo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/save")
    public Organization addOrganization(@RequestBody Organization organization) {
        return organizationService.saveOrganization(organization);
    }

    @GetMapping("/{id}")
    public Organization getOrganization(@PathVariable Long id) {
        return organizationService.getOrganizationById(id);
    }

    @GetMapping
    public List<Organization> getAll() {
        return organizationService.getAll();
    }

    @PutMapping("/update")
    public Organization updateOrganization(@RequestBody Organization organization) {
        return organizationService.saveOrganization(organization);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrganization(@PathVariable Long id) {
        organizationService.deleteOrganization(id);
    }
}
