package com.example.pokemon.service;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.EvolutionChain;
import com.example.pokemon.dto.*;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.repository.EvolutionChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private EvolutionChainRepository evolutionChainRepository;

    private final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon/";

    public Pokemon getPokemon(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = POKEAPI_URL + id;
        PokemonDto pokemonDto = restTemplate.getForObject(url, PokemonDto.class);

        // Convertir PokemonDto a la entidad Pokemon
        Pokemon pokemon = new Pokemon();
        pokemon.setId(id);
        pokemon.setName(pokemonDto.getName());

        // Obtener el tipo principal del Pokémon (si existe)
        if (pokemonDto.getTypes() != null && !pokemonDto.getTypes().isEmpty()) {
            String primaryType = pokemonDto.getTypes().get(0).getType().getName();
            pokemon.setType(primaryType);
        } else {
            pokemon.setType("Unknown"); // Manejar el caso de que no tenga tipo
        }

        // Guardar Pokémon en la base de datos
        pokemonRepository.save(pokemon);

        return pokemon;
    }
}
