package com.gestion.g1.controllers;

import com.gestion.g1.models.Objet;
import com.gestion.g1.models.Transaction;
import com.gestion.g1.models.User;
import com.gestion.g1.repositories.TransactionRepository;
import com.gestion.g1.repositories.UserRepository;
import com.gestion.g1.services.ObjectService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ✅ MANQUANT
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.time.LocalDate;

@Controller
public class TransactionController {

    @Autowired
    private ObjectService objectService;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/rentObject")
    public String rentPage(Model model) {
        model.addAttribute("objects", objectService.getAllObjet());
        return "RentObject";
    }

    @PostMapping("/rentObject")
    public String rentObject(HttpServletRequest request, Principal principal, Model model) {
        Long objectId = Long.parseLong(request.getParameter("objectId"));
        LocalDate start = LocalDate.parse(request.getParameter("start"));
        LocalDate end = LocalDate.parse(request.getParameter("end"));

        Objet objet = objectService.getObjet(objectId);
        User renter = userRepository.findByUsername(principal.getName()).orElse(null);

        Transaction tx = new Transaction(objet, renter, start, end);
        transactionRepository.save(tx);

        model.addAttribute("messageJsp", "Object rented successfully!");
        model.addAttribute("objects", objectService.getAllObjet()); // Pour réafficher les objets
        return "RentObject";
    }

    @GetMapping("/transactions")
    public String listTransactions(Model model) {
        model.addAttribute("transactions", transactionRepository.findAll());
        return "TransactionsList";
    }
}
