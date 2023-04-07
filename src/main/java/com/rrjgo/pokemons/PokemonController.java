package com.rrjgo.pokemons;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemons() {
        return new ResponseEntity<List<Pokemon>>(pokemonService.allPokemons(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pokemon>> getPokemonById(@PathVariable Integer id) {
        return new ResponseEntity<Optional<Pokemon>>( pokemonService.singlePokemon(id), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<String> addPokemon( @RequestBody Pokemon pokemon) {
        return new ResponseEntity<>(pokemonService.addPokemon(pokemon), HttpStatus.CREATED);
    }
}
