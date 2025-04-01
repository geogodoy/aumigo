package com.geogodoy.aumigo.service;


import com.geogodoy.aumigo.domain.model.Donation;
import com.geogodoy.aumigo.domain.model.Wallet;
import com.geogodoy.aumigo.exception.DonationException;

public interface WalletService {

    void addAmountByOrganization(Double amount, Long organizationId);

    Wallet saveWallet(Wallet wallet);

    Wallet getWalletByOrganizationId(Long organizationId);
}
