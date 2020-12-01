package com.antoine.gestionsi.project.controller;

import com.antoine.gestionsi.project.entity.Editeur;
import com.antoine.gestionsi.project.service.EditeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EditeurController {

    @Autowired
    private EditeurService service;

    @PostMapping("/editeur/add")
    public Editeur addEditeur(@RequestBody Editeur editeur) {
        System.out.println(editeur);
        return service.saveEditeur(editeur);
    }

    @PostMapping("/editeurs/addAll")
    public List<Editeur> addEditeurs(@RequestBody List<Editeur> editeurs) {
        return service.saveEditeurs(editeurs);
    }

    @GetMapping("/editeur")
    public List<Editeur> findAllEditeurs() {
        return service.getEditeurs();
    }

    @GetMapping("/editeurById/{id_editeur}")
    public Editeur findEditeurById(@PathVariable int id_editeur) {
        return service.getEditeurById(id_editeur);
    }

    @GetMapping("/editeurByName/{name}")
    public Editeur findEditeurByName(@PathVariable String name) {
        return service.getEditeurByName(name);
    }

    @DeleteMapping("/editeur/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return service.deleteById(id);
    }

    @PutMapping("/editeur/update")
    public Editeur updateEditeur(@RequestBody Editeur editeur) {
        return service.updateEditeur(editeur);
    }
}
