package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.Wallet;
import com.geogodoy.aumigo.domain.repository.WalletRepository;
import com.geogodoy.aumigo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Override
    public void addAmountByOrganization(Double amount, Long organizationId) {
        Wallet wallet = walletRepository.findByOrganizationId(organizationId);
        if (wallet == null) {
            wallet = new Wallet();
            wallet.setOrganizationId(organizationId);
            wallet.setAmount(amount);
            walletRepository.save(wallet);
            return;
        }
        wallet.setAmount(wallet.getAmount() + amount);
        walletRepository.save(wallet);
    }

    @Override
    public Wallet getWalletByOrganizationId(Long organizationId) {
        return walletRepository.findByOrganizationId(organizationId);
    }
}
