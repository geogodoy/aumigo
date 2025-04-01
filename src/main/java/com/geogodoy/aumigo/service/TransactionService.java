package com.geogodoy.aumigo.service;

import com.geogodoy.aumigo.domain.model.Organization;
import com.geogodoy.aumigo.domain.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);
}
