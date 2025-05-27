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

    public Transaction(Long id, Objet objet, String username, LocalDate dateDebut, LocalDate dateFin) {
        this.id = id;
        this.objet = objet;
        this.username = username;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Transaction() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Objet getObjet() {
        return objet;
    }

    public void setObjet(Objet objet) {
        this.objet = objet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
