package com.senai.music.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {

    @Id
    private int id;
    private int idArtista;
    private String nome;
    private Genero genero;

}
