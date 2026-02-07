# Architektura - java-ac4y-g8h-rest-service-otf

## Attekintes

Az "on-the-fly" REST szolgaltatas valtozat, ahol minden muvelet GET vegpontkent erheto el `@QueryParam("request")` JSON parameteren keresztul.

## Szerkezet

```
src/main/java/ac4y/guid8humanid/service/restful/
  Ac4yGUID8HumanIDRestfulService.java - JAX-RS GET-alapu REST vegpontok
```

## Osztalyok

### Ac4yGUID8HumanIDRestfulService
- `@Path("")` gyoker eleresi ut
- Minden vegpont GET metodust hasznal
- JSON keres a `request` query parameterben erkezik
- Valasz JSON formatumban

## Kulonbseg a RestService-tol

- RestService: POST vegpontok JSON body-val
- RestServiceOnTheFly: GET vegpontok query parameterrel
- OTF verzio nem tartalmaz WAR csomagolast

## Fuggetlensegek

- Jersey 1.9/1.19 (JAX-RS)
- ac4y-g8h-object-service
- ac4y-http-handler
- MySQL Connector

## Eredet

Az `IJAc4yG8HModule/RestServiceOnTheFly` modulbol kinyerve.
