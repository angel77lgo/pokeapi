package com.angel.conrollers;

import com.angel.models.Log;
import com.angel.models.helpers.PokemonDetails;
import com.angel.models.helpers.GetPokemonRequest;
import com.angel.models.helpers.GetPokemonResponse;
import com.angel.repositories.LogRepository;
import com.angel.services.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Locale;

@Endpoint
public class PokemonController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private LogRepository logRepository;

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse search_pokemon(@RequestPayload GetPokemonRequest request) throws IOException {


        String pokemon_name = request.getPokemon().toLowerCase(Locale.ROOT);

        System.out.println("Pokemon name -> " + pokemon_name);

        APIService apiService = new APIService();

        PokemonDetails pokemonDetails = apiService.getPokemon(pokemon_name);

        GetPokemonResponse pokemonResponse = new GetPokemonResponse();

        pokemonResponse.setPokemonDetails(pokemonDetails);

        String ipAddress = httpServletRequest.getHeader("X-FORWARDED-FOR");
        String method = null;
        if (ipAddress == null) {
            ipAddress = httpServletRequest.getRemoteAddr();
            method = httpServletRequest.getMethod();
        }

        Log log = new Log();

        log.setSourceIp(ipAddress);
        log.setDateCreation(LocalDateTime.now());
        log.setMethod(method);
        log.setPokemonHasSearch(pokemonDetails.getPokemon_name());


        logRepository.save(log);

        return pokemonResponse;
    }
}
