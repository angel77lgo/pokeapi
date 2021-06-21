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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemonDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemonDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pokemon_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abilities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="held_items">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="items">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="item_details">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="location_areas_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemonDetails", propOrder = {
    "pokemonName",
    "abilities",
    "baseExperience",
    "heldItems",
    "id",
    "locationAreasEncounters"
})
public class PokemonDetails {

    @XmlElement(name = "pokemon_name", required = true)
    protected String pokemonName;
    @XmlElement(required = true)
    protected PokemonDetails.Abilities abilities;
    @XmlElement(name = "base_experience")
    protected int baseExperience;
    @XmlElement(name = "held_items", required = true)
    protected PokemonDetails.HeldItems heldItems;
    protected int id;
    @XmlElement(name = "location_areas_encounters", required = true)
    protected String locationAreasEncounters;

    /**
     * Obtiene el valor de la propiedad pokemonName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPokemonName() {
        return pokemonName;
    }

    /**
     * Define el valor de la propiedad pokemonName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPokemonName(String value) {
        this.pokemonName = value;
    }

    /**
     * Obtiene el valor de la propiedad abilities.
     * 
     * @return
     *     possible object is
     *     {@link PokemonDetails.Abilities }
     *     
     */
    public PokemonDetails.Abilities getAbilities() {
        return abilities;
    }

    /**
     * Define el valor de la propiedad abilities.
     * 
     * @param value
     *     allowed object is
     *     {@link PokemonDetails.Abilities }
     *     
     */
    public void setAbilities(PokemonDetails.Abilities value) {
        this.abilities = value;
    }

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     */
    public void setBaseExperience(int value) {
        this.baseExperience = value;
    }

    /**
     * Obtiene el valor de la propiedad heldItems.
     * 
     * @return
     *     possible object is
     *     {@link PokemonDetails.HeldItems }
     *     
     */
    public PokemonDetails.HeldItems getHeldItems() {
        return heldItems;
    }

    /**
     * Define el valor de la propiedad heldItems.
     * 
     * @param value
     *     allowed object is
     *     {@link PokemonDetails.HeldItems }
     *     
     */
    public void setHeldItems(PokemonDetails.HeldItems value) {
        this.heldItems = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad locationAreasEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreasEncounters() {
        return locationAreasEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreasEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreasEncounters(String value) {
        this.locationAreasEncounters = value;
    }


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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "name",
        "isHidden",
        "slot"
    })
    public static class Abilities {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(name = "is_hidden")
        protected boolean isHidden;
        protected int slot;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad isHidden.
         * 
         */
        public boolean isIsHidden() {
            return isHidden;
        }

        /**
         * Define el valor de la propiedad isHidden.
         * 
         */
        public void setIsHidden(boolean value) {
            this.isHidden = value;
        }

        /**
         * Obtiene el valor de la propiedad slot.
         * 
         */
        public int getSlot() {
            return slot;
        }

        /**
         * Define el valor de la propiedad slot.
         * 
         */
        public void setSlot(int value) {
            this.slot = value;
        }

    }


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
     *         &lt;element name="items">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="item_details">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "items"
    })
    public static class HeldItems {

        @XmlElement(required = true)
        protected PokemonDetails.HeldItems.Items items;

        /**
         * Obtiene el valor de la propiedad items.
         * 
         * @return
         *     possible object is
         *     {@link PokemonDetails.HeldItems.Items }
         *     
         */
        public PokemonDetails.HeldItems.Items getItems() {
            return items;
        }

        /**
         * Define el valor de la propiedad items.
         * 
         * @param value
         *     allowed object is
         *     {@link PokemonDetails.HeldItems.Items }
         *     
         */
        public void setItems(PokemonDetails.HeldItems.Items value) {
            this.items = value;
        }


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
         *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="item_details">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "itemName",
            "itemDetails"
        })
        public static class Items {

            @XmlElement(name = "item_name", required = true)
            protected String itemName;
            @XmlElement(name = "item_details", required = true)
            protected PokemonDetails.HeldItems.Items.ItemDetails itemDetails;

            /**
             * Obtiene el valor de la propiedad itemName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemName() {
                return itemName;
            }

            /**
             * Define el valor de la propiedad itemName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemName(String value) {
                this.itemName = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDetails.
             * 
             * @return
             *     possible object is
             *     {@link PokemonDetails.HeldItems.Items.ItemDetails }
             *     
             */
            public PokemonDetails.HeldItems.Items.ItemDetails getItemDetails() {
                return itemDetails;
            }

            /**
             * Define el valor de la propiedad itemDetails.
             * 
             * @param value
             *     allowed object is
             *     {@link PokemonDetails.HeldItems.Items.ItemDetails }
             *     
             */
            public void setItemDetails(PokemonDetails.HeldItems.Items.ItemDetails value) {
                this.itemDetails = value;
            }


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
             *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
                "version",
                "rarity"
            })
            public static class ItemDetails {

                @XmlElement(required = true)
                protected String version;
                protected int rarity;

                /**
                 * Obtiene el valor de la propiedad version.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersion() {
                    return version;
                }

                /**
                 * Define el valor de la propiedad version.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersion(String value) {
                    this.version = value;
                }

                /**
                 * Obtiene el valor de la propiedad rarity.
                 * 
                 */
                public int getRarity() {
                    return rarity;
                }

                /**
                 * Define el valor de la propiedad rarity.
                 * 
                 */
                public void setRarity(int value) {
                    this.rarity = value;
                }

            }

        }

    }

}
