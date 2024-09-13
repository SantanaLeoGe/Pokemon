package com.example.pokemon.controller;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getPokemon(@PathVariable Long id) {
        Pokemon pokemon = pokemonService.getPokemon(id);
        return ResponseEntity.ok(pokemon);
    }
}
