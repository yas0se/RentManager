package com.gestion.g1.repositories;

import com.gestion.g1.models.Objet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetRepository extends JpaRepository<Objet, Long> {
}
