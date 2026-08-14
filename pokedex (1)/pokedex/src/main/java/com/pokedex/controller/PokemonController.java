package com.pokedex.controller;

import com.pokedex.repository.PokemonRepository;
import com.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")


public class PokemonController {
    private PokemonService pokemonService;


    public PokemonController(PokemonService pokemonService) {
       this.pokemonService = pokemonService;
    }

    @GetMapping ("/oi/{nome}")
    public String HelloWorld(@PathVariable String nome){

        String saudacao = pokemonService.HelloWorld(nome);

        return saudacao;
    }
    @GetMapping ("/pokemon/pikachu")
    public String Picachu(@PathVariable String pikachu){
        String pegar = pokemonService.pi
    }





    }

