package com.antoine.gestionsi.project.service;

import com.antoine.gestionsi.project.entity.Editeur;
import com.antoine.gestionsi.project.repository.EditeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditeurService {

    @Autowired
    private EditeurRepository repository;

    public Editeur saveEditeur(Editeur editeur) {
        System.out.println(editeur.getName());
        return repository.save(editeur);
    }

    public List<Editeur> saveEditeurs(List<Editeur> editeurs) {
        return repository.saveAll(editeurs);
    }

    public List<Editeur> getEditeurs() {
        return repository.findAll();
    }

    public Editeur getEditeurById(int id_editeur) {
        return repository.findById(id_editeur).orElse(null);
    }

    public Editeur getEditeurByName(String name) {
        return repository.findByName(name);
    }

    public String deleteById(int id) {
        repository.deleteById(id);
        return "Product Removed! : " + id;
    }

    public Editeur updateEditeur(Editeur editeur) {
        //Check the existing editeur in the db
        Editeur existingEditeur = repository.findById(editeur.getId()).orElse(null);
        System.out.println("OK 1" + editeur.getId());
        //set new datas
        existingEditeur.setName(editeur.getName());
        System.out.println("OK 2");
        //save the new product
        return repository.save(existingEditeur);
    }
}
