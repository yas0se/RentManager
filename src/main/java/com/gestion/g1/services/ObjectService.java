package com.gestion.g1.services;

import com.gestion.g1.models.Objet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ObjectService {

    Objet saveObjet(Objet objet);
    Objet updateObjet(Objet objet);
    Objet getObjet(Long id);
    List<Objet> getAllObjet();
    void deleteObjectById(Long id);

}
