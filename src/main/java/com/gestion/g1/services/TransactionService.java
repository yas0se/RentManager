package com.gestion.g1.services;

import com.gestion.g1.models.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface TransactionService {
    void createTransaction(Long objetId, LocalDate dateDebut, LocalDate dateFin, String username);
    List<Transaction> getAllTransactions();}
