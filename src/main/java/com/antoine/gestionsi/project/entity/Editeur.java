package com.antoine.gestionsi.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "editeur")
public class Editeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_editeur;
    private String name;

    public int getId() {
        return id_editeur;
    }

    public void setId_Editeur(int id_Editeur) {
        this.id_editeur = id_editeur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}