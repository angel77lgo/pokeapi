package com.angel.services;

import com.angel.models.helpers.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class APIService {


    private RestTemplate restTemplate;

    private String url = "https://pokeapi.co/api/v2/pokemon/";

    public PokemonDetails getPokemon(String pokemon_name) throws IOException {
        URL url = new URL(this.url + pokemon_name);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() != 200){
            System.out.println("Error API");
        }

        InputStreamReader in = new InputStreamReader(connection.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output = br.readLine();


        connection.disconnect();

        JSONObject pokemonJson = new JSONObject(output);;
        PokemonDetails pokemonDetails = new PokemonDetails();


        //System.out.println(pokemonJson);

        String pokemonName = pokemonJson.getString("name");

        JSONArray abilities = pokemonJson.getJSONArray("abilities");

        System.out.println(abilities);

        ArrayList<Ability> abilityArrayList = new ArrayList<>();

        for (Object ability: abilities) {
            if ( ability instanceof JSONObject) {

              //  System.out.println(((JSONObject) ability).getJSONObject("ability").getNumber("slot"));

                String abilityName = ((JSONObject) ability).getJSONObject("ability").getString("name");
                Boolean isHidden = ((JSONObject) ability).getBoolean("is_hidden");
                Integer slot = ((JSONObject) ability).getInt("slot");

                Ability newAbility = new Ability();

                newAbility.setName(abilityName);
                newAbility.setIs_hidden(isHidden);
                newAbility.setSlot(slot);

                abilityArrayList.add(newAbility);
            }
        }

        Integer baseExperience = pokemonJson.getInt("base_experience");

        ArrayList<Item> itemArrayList = new ArrayList<>();

        JSONArray heldItemsArray = pokemonJson.getJSONArray("held_items");

        if (heldItemsArray.isEmpty()){

        }else {

            System.out.println(heldItemsArray);

            for (Object itemElement: heldItemsArray) {

                Item newItem = new Item();
                ArrayList<ItemDetails> itemDetailsArray = new ArrayList<>();

                if ( itemElement instanceof JSONObject) {
                    String itemName = ((JSONObject) itemElement).getJSONObject("item").getString("name");
                    JSONArray itemsDetails = ((JSONObject) itemElement).getJSONArray("version_details");

                    for(Object itemDetails: itemsDetails) {
                        if (itemDetails instanceof  JSONObject) {
                            ItemDetails newItemDetails = new ItemDetails();
                            String versionName = ((JSONObject) itemDetails).getJSONObject("version").getString("name");
                            Integer rarity = ((JSONObject) itemDetails).getInt("rarity");

                            newItemDetails.setVersion(versionName);
                            newItemDetails.setRarity(rarity);

                            itemDetailsArray.add(newItemDetails);
                        }
                    }

                    newItem.setItem_name(itemName);
                    newItem.setItemDetails(itemDetailsArray);

                    itemArrayList.add(newItem);
                }
            }




        }
        HeldItem heldItem = new HeldItem();
        heldItem.setItems(itemArrayList);

        Integer id = pokemonJson.getInt("id");
        String locationArea = pokemonJson.getString("location_area_encounters");



        pokemonDetails.setPokemon_name(pokemonName.substring(0,1).toUpperCase() + pokemonName.substring(1));
        pokemonDetails.setAbilities(abilityArrayList);
        pokemonDetails.setBaseExperience(baseExperience);
        pokemonDetails.setHeldItem(heldItem);
        pokemonDetails.setId(id);
        pokemonDetails.setLocationAreasEncounter(locationArea);

        System.out.println(pokemonDetails.getPokemon_name());

        return pokemonDetails;


    }

}
