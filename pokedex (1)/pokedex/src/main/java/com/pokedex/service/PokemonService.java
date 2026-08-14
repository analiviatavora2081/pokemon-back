package com.pokedex.service;

import com.pokedex.model.Pokemon;
import com.pokedex.repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public String HelloWorld(String nome){
        return "Hello" + pokemonRepository.mostrarNome();
    }
    private Pokemon pegarpokemon;

    public String Pokemon(String pegarpokemon){
       return "pegarpokemon" +  Pokemon.;
    }
}
