package com.geogodoy.aumigo.controller;

import com.geogodoy.aumigo.domain.model.Donation;
import com.geogodoy.aumigo.service.DonationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donations")
public class DonationController {

    private DonationService donationService;

    @PostMapping("/save")
    public Donation addDonation(@RequestBody Donation donation) {
        return donationService.saveDonation(donation);
    }

}
