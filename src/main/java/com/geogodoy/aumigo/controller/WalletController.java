package com.geogodoy.aumigo.controller;

import com.geogodoy.aumigo.domain.model.Animal;
import com.geogodoy.aumigo.domain.model.Wallet;
import com.geogodoy.aumigo.service.AnimalService;
import com.geogodoy.aumigo.service.OrganizationService;
import com.geogodoy.aumigo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletService service;


    @GetMapping("/{organizationId}")
    public Wallet getWalletByOrganization(@PathVariable Long organizationId) {
        return service.getWalletByOrganizationId(organizationId);
    }

}
