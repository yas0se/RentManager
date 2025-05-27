package com.gestion.g1.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Objet objet;

    private String username; // nom de l'utilisateur connecté

    private LocalDate dateDebut;

    private LocalDate dateFin;

    // Getters et setters
}
