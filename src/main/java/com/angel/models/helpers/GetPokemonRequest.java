package com.angel.models.helpers;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pokemon"
})
@XmlRootElement(namespace = "http://www.baeldung.com/springsoap/gen", name = "GetPokemonRequest")
public class GetPokemonRequest {

    @XmlElement(namespace = "http://www.baeldung.com/springsoap/gen", required = true)
    protected String pokemon;

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

}
