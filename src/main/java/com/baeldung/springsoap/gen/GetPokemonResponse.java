//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci\u00f3n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder\u00e1n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.20 a las 06:13:43 PM CDT 
//


package com.baeldung.springsoap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pokemonDetails" type="{http://www.baeldung.com/springsoap/gen}pokemonDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pokemonDetails"
})
@XmlRootElement(name = "GetPokemonResponse")
public class GetPokemonResponse {

    @XmlElement(required = true)
    protected PokemonDetails pokemonDetails;

    /**
     * Obtiene el valor de la propiedad pokemonDetails.
     * 
     * @return
     *     possible object is
     *     {@link PokemonDetails }
     *     
     */
    public PokemonDetails getPokemonDetails() {
        return pokemonDetails;
    }

    /**
     * Define el valor de la propiedad pokemonDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PokemonDetails }
     *     
     */
    public void setPokemonDetails(PokemonDetails value) {
        this.pokemonDetails = value;
    }

}
