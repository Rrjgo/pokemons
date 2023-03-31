package com.rrjgo.pokemons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Id
    private ObjectId _id;

    private Integer id;
    private String name;
    private String imageUrl;
    private String dexEntry;
}
