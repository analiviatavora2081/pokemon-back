package com.pokedex.model;

import org.springframework.web.bind.annotation.GetMapping;

public class Pokemon {

    private String nome;
    private String tipo;

    public Pokemon(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @GetMapping("/pokemon/pikachu")
    public String Pokemon pegarPokemon(){
        return pegarpokemon;

    }
}
