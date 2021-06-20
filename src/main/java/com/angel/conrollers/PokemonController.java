package com.angel.conrollers;

import com.angel.models.PokemonDetails;
import com.angel.models.helpers.GetPokemonRequest;
import com.angel.models.helpers.GetPokemonResponse;
import com.angel.services.APIService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.io.IOException;
import java.util.Locale;

@Endpoint
public class PokemonController {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse search_pokemon(@RequestPayload GetPokemonRequest request) throws IOException {


        String pokemon_name = request.getPokemon().toLowerCase(Locale.ROOT);

        System.out.println("Pokemon name -> " + pokemon_name);

        APIService apiService = new APIService();

        PokemonDetails pokemonDetails = apiService.getPokemon(pokemon_name);

        GetPokemonResponse pokemonResponse = new GetPokemonResponse();

       // System.out.println("Final ->" + pokemonDetails.getHeldItem().getItems().get(0).getItemDetails().get(0).getVersion());

        pokemonResponse.setPokemonDetails(pokemonDetails);

        return pokemonResponse;
    }
}
