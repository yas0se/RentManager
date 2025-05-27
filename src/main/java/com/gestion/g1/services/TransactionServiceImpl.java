package com.gestion.g1.services;

import com.gestion.g1.models.Objet;
import com.gestion.g1.models.Transaction;
import com.gestion.g1.repositories.ObjetRepository;
import com.gestion.g1.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;



@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private ObjetRepository objetRepository;

    @Override
    public void createTransaction(Long objetId, LocalDate dateDebut, LocalDate dateFin, String username) {
        Objet objet = objetRepository.findById(objetId).orElseThrow();
        Transaction transaction = new Transaction();
        transaction.setObjet(objet);
        transaction.setDateDebut(dateDebut);
        transaction.setDateFin(dateFin);
        transaction.setUsername(username);
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return transactionRepository.findByUsername(authentication.getName());
    }
}
