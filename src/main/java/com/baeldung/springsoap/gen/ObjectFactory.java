//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci\u00f3n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder\u00e1n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.20 a las 06:13:43 PM CDT 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.springsoap.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PokemonDetails }
     * 
     */
    public PokemonDetails createPokemonDetails() {
        return new PokemonDetails();
    }

    /**
     * Create an instance of {@link PokemonDetails.HeldItems }
     * 
     */
    public PokemonDetails.HeldItems createPokemonDetailsHeldItems() {
        return new PokemonDetails.HeldItems();
    }

    /**
     * Create an instance of {@link PokemonDetails.HeldItems.Items }
     * 
     */
    public PokemonDetails.HeldItems.Items createPokemonDetailsHeldItemsItems() {
        return new PokemonDetails.HeldItems.Items();
    }

    /**
     * Create an instance of {@link GetPokemonResponse }
     * 
     */
    public GetPokemonResponse createGetPokemonResponse() {
        return new GetPokemonResponse();
    }

    /**
     * Create an instance of {@link GetPokemonRequest }
     * 
     */
    public GetPokemonRequest createGetPokemonRequest() {
        return new GetPokemonRequest();
    }

    /**
     * Create an instance of {@link PokemonDetails.Abilities }
     * 
     */
    public PokemonDetails.Abilities createPokemonDetailsAbilities() {
        return new PokemonDetails.Abilities();
    }

    /**
     * Create an instance of {@link PokemonDetails.HeldItems.Items.ItemDetails }
     * 
     */
    public PokemonDetails.HeldItems.Items.ItemDetails createPokemonDetailsHeldItemsItemsItemDetails() {
        return new PokemonDetails.HeldItems.Items.ItemDetails();
    }

}
