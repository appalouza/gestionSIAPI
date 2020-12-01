package com.antoine.gestionsi.project.repository;

import com.antoine.gestionsi.project.entity.Editeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditeurRepository extends JpaRepository<Editeur,Integer> {

   Editeur findByName(String name);
}
