package com.angel.models.helpers;

import java.util.ArrayList;

public class PokemonDetails {
    String pokemon_name;
    ArrayList<Ability> abilities;
    Integer baseExperience;
    HeldItem heldItem;
    Integer id;
    String locationAreasEncounter;

    public String getPokemon_name() {
        return pokemon_name;
    }

    public void setPokemon_name(String pokemon_name) {
        this.pokemon_name = pokemon_name;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public HeldItem getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(HeldItem heldItem) {
        this.heldItem = heldItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationAreasEncounter() {
        return locationAreasEncounter;
    }

    public void setLocationAreasEncounter(String locationAreasEncounter) {
        this.locationAreasEncounter = locationAreasEncounter;
    }
}
