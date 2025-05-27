package com.gestion.g1.repositories;

import com.gestion.g1.models.Objet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ObjetRepository extends JpaRepository<Objet, Long> {
    List<Objet> findByUsername(String username);
}
