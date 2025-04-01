package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.Donation;
import com.geogodoy.aumigo.domain.model.EDonationStatus;
import com.geogodoy.aumigo.domain.repository.DonationRepository;
import com.geogodoy.aumigo.exception.DonationException;
import com.geogodoy.aumigo.service.DonationService;
import com.geogodoy.aumigo.service.ScheduledDonationProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduledDonationProcessorServiceImpl implements ScheduledDonationProcessorService {

    @Autowired
    private DonationRepository donationRepository;

    @Autowired
    private DonationService donationService;

    @Override
    @Scheduled(fixedRateString = "${donation.processor.interval}")
    public void processPendingDonations() {
        List<Donation> pendingDonations = donationRepository.findByStatus(EDonationStatus.PENDING);
        if (pendingDonations.isEmpty()) {
            return;
        }
        for (Donation donation : pendingDonations) {
            try {
                donationService.processDonation(donation);
            } catch (DonationException e) {
                // Log the exception and continue processing other donations
                e.printStackTrace();
            }
        }
    }
}
