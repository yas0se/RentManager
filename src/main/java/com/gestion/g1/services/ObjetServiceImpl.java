package com.gestion.g1.services;

import com.gestion.g1.models.Objet;
import com.gestion.g1.repositories.ObjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetServiceImpl implements ObjectService{
    @Autowired
    ObjetRepository objetRepository;

    @Override
    public Objet saveObjet(Objet objet) {
        return objetRepository.save(objet);
    }

    @Override
    public Objet updateObjet(Objet objet) {
        return objetRepository.save(objet);
    }

    @Override
    public Objet getObjet(Long id) {
        return objetRepository.findById(id).get();
    }

    @Override
    public List<Objet> getAllObjet() {
        return objetRepository.findAll();
    }

    @Override
    public void deleteObjectById(Long id) {
        objetRepository.deleteById(id);
    }
}
