package com.angel.models.helpers;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pokemonDetails"
})
@XmlRootElement(namespace = "http://www.baeldung.com/springsoap/gen", name = "GetPokemonResponse")
public class GetPokemonResponse {

    @XmlElement(required = true)
    PokemonDetails pokemonDetails;

    public PokemonDetails getPokemonDetails() {
        return pokemonDetails;
    }

    public void setPokemonDetails(PokemonDetails pokemonDetails) {
        this.pokemonDetails = pokemonDetails;
    }
}
