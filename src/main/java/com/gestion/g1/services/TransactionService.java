package com.gestion.g1.services;

import com.gestion.g1.models.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    Transaction getTransaction(Long id);
    List<Transaction> getAllTransactions();
    void deleteTransactionById(Long id);
}
