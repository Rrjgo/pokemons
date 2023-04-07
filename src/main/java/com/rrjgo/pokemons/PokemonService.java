package com.rrjgo.pokemons;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> allPokemons(){
        return  pokemonRepository.findAll();
    }

    public Optional<Pokemon> singlePokemon(Integer id) {
        return pokemonRepository.findById(id);
    }


    public String addPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon).getId().toString();
    }

    public List<Pokemon> getPokemonByName(String name) {
        return pokemonRepository.findByNameContainingIgnoreCase(name);
    }
}
