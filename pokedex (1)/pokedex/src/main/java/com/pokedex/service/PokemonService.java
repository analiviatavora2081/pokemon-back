package com.pokedex.pokedex.service;


import com.pokedex.pokedex.model.Pokemon;
import com.pokedex.pokedex.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository, PokemonRepository pokemonRepository1) {
        this.pokemonRepository = pokemonRepository1;
    }

    public List<Pokemon> getLista(){

        return pokemonRepository.getLista();
    }




    public String adicionarPokemon(Pokemon pokemon){


        return pokemonRepository.addPokemon(pokemon);
    }







    public Pokemon buscarPokemon() {

        return pokemonRepository.buscarPokemon();

    }

}