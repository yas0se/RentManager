package com.gestion.g1.controllers;

import com.gestion.g1.repositories.ObjetRepository;
import com.gestion.g1.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private ObjetRepository objetRepository;

    @GetMapping("/createTransaction")
    public String showTransactionForm(Model model) {
        model.addAttribute("objets", objetRepository.findAll());
        return "CreateTransaction";
    }

    @PostMapping("/saveTransaction")
    public String saveTransaction(@RequestParam Long objetId,
                                  @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateDebut,
                                  @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFin,
                                  Principal principal) {
        transactionService.createTransaction(objetId, dateDebut, dateFin, principal.getName());
        return "redirect:/transactionList";
    }

    @GetMapping("/transactionList")
    public String showTransactionList(Model model) {
        model.addAttribute("transactions", transactionService.getAllTransactions());
        return "TransactionList";
    }
}

