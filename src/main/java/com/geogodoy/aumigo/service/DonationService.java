package com.geogodoy.aumigo.service;


import com.geogodoy.aumigo.domain.model.Donation;
import com.geogodoy.aumigo.exception.DonationException;

public interface DonationService {

    Donation saveDonation(Donation donation);

    void processDonation(Donation donation) throws DonationException;
}
