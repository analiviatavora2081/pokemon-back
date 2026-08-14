package com.pokedex.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {

    private String nome ;

    public PokemonRepository() {
        this.nome = "Ana Lívia ";
    }

    public String mostrarNome(){
        return nome;
    }
}
