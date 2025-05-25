package com.gestion.g1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Objet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObjet;
    private String nomObjet;
    private  String descriptionObjet;
//    private User ownerObject;


    public Objet(String nomObjet, String descriptionObjet) {
        this.nomObjet = nomObjet;
        this.descriptionObjet = descriptionObjet;
    }

    public Objet() {
        super();
    }

    @Override
    public String toString() {
        return "Objet{" +
                "idObjet=" + idObjet +
                ", nomObjet='" + nomObjet + '\'' +
                ", descriptionObjet='" + descriptionObjet + '\'' +
                '}';
    }

    public Long getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(Long idObjet) {
        this.idObjet = idObjet;
    }

    public String getNomObjet() {
        return nomObjet;
    }

    public void setNomObjet(String nomObjet) {
        this.nomObjet = nomObjet;
    }

    public String getDescriptionObjet() {
        return descriptionObjet;
    }

    public void setDescriptionObjet(String descriptionObjet) {
        this.descriptionObjet = descriptionObjet;
    }
}
