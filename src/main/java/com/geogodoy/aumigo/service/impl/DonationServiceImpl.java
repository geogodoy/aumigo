package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.*;
import com.geogodoy.aumigo.domain.repository.DonationRepository;
import com.geogodoy.aumigo.domain.repository.OrganizationRepository;
import com.geogodoy.aumigo.exception.DonationException;
import com.geogodoy.aumigo.service.DonationService;
import com.geogodoy.aumigo.service.OrganizationService;
import com.geogodoy.aumigo.service.TransactionService;
import com.geogodoy.aumigo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DonationServiceImpl implements DonationService {

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private WalletService walletService;

    @Autowired
    private DonationRepository donationRepository;

    @Override
    public Donation saveDonation(Donation donation) {
        donation.setStatus(EDonationStatus.PENDING);
        return donationRepository.save(donation);
    }

    @Override
    public void processDonation(Donation donation) throws DonationException {

        List<Long> organizationsActive = organizationService.getAllActive();

        // Map para armazenar a contagem de animais por organização
        Map<Long, Integer> animalCountMap = new HashMap<>();
        int totalAnimals = 0;

        for (Long organizationId : organizationsActive) {
            int animalCount = organizationService.countAnimalsByOrganization(organizationId);
            animalCountMap.put(organizationId, animalCount);
            totalAnimals += animalCount;
        }

        for (Map.Entry<Long, Integer> entry : animalCountMap.entrySet()) {
            try {
                Long organizationId = entry.getKey();
                int animalCount = entry.getValue();

                double percentage = ((double) animalCount / totalAnimals) * 100;
                double donationAmount = donation.getValue() * (percentage/100);

                donation.setValue(donationAmount);
                donation.setStatus(EDonationStatus.PROCESSED);
                donation.setDescription(donation.getDescription());
                donation.setOrganizationId(organizationId);

                donationRepository.save(donation);

                walletService.addAmountByOrganization(donationAmount, organizationId);

                Transaction transaction = new Transaction();
                transaction.setOrganizationId(organizationId);
                transaction.setValue(donationAmount);
                transaction.setType(ETransactionType.IN);
                transaction.setWalletId(walletService.getWalletByOrganizationId(organizationId).getId());

                transactionService.saveTransaction(transaction);

            } catch (Exception e) {
                donation.setStatus(EDonationStatus.FAILED);
                donationRepository.save(donation);
                throw new DonationException("Erro ao processar doação para organização", e);

            }
        }
    }

}
