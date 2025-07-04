package com.gestion.g1.services;

import com.gestion.g1.models.Objet;
import com.gestion.g1.repositories.ObjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        if (objet.getIdObjet() == null || !objetRepository.existsById(objet.getIdObjet())) {
            throw new RuntimeException("Objet non existant avec l'id : " + objet.getIdObjet());
        }
        return objetRepository.save(objet);
    }

    @Override
    public Objet getObjet(Long id) {
        return objetRepository.findById(id).get();
    }

    @Override
    public List<Objet> getAllObjet() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return objetRepository.findByUsername(authentication.getName());
    }

    @Override
    public void deleteObjectById(Long id) {
        objetRepository.deleteById(id);
    }
}
