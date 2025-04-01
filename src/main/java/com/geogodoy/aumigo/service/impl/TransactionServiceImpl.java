package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.Transaction;
import com.geogodoy.aumigo.domain.repository.TransactionRepository;
import com.geogodoy.aumigo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
