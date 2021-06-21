# Búsqueda Pokémon SOAP Service

### Creación de los servicios
Este es un servicio SOAP para la búsqueda de Pokémon a través pokeapi
[PokeAPI](https://pokeapi.co/)

Para poder iniciar el proyecto lo puede hacer a través de Docker Compose,
solo necesita ejecutar el siguiente comando:

```shell
docker-compose build
```

Este comando lo que hará es crear la imagen del servicio, para poder
consumirlo es necesario levantarlo solo necesita ejecutar:

```shell
docker-compose up
```

### Utilización del Servicio

Para poder consumir el servicio de hace a través de una petición web
esta se puede hacer mediante CURL

```shell
curl -L -X POST 'http://localhost:8080/ws' \
-H 'Content-Type: text/xml' \
--data-raw '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://www.baeldung.com/springsoap/gen">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:GetPokemonRequest>
            <gs:pokemon>alomomola</gs:pokemon>
        </gs:GetPokemonRequest>
    </soapenv:Body>
</soapenv:Envelope>'
```