# Pokemons-SpringBoot

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0--M2-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
![MongoDB Atlas](https://img.shields.io/badge/MongoDB-%20Atlas-orange)

![Frontend](https://img.shields.io/badge/Frontend-React-blue) https://github.com/Rrjgo/pokemon-frontend

This is a sample Java / Spring Boot / MongoDB application that serves as a Tech Demo for exploring Java Web Application backend development.

## Table of Contents
  - [Overview](#overview)
  - [Running the Application](#running-the-application)
  - [API Endpoints](#api-endpoints)
  - [Database](#database)
  - [Spring Boot](#spring-boot)

## Overview
This tech demo implements a simple Fetch and Post API using Java, Spring Boot, and MongoDB. 

The application showcases the use of various Spring Boot features, such as:
 - Different bussiness layer  
 - RESTful API development
 - Database connectivity with Spring Data MongoDB


## Running the Application

 - Make sure **JDK 17** or later is installed
 - Run the application using the following command
 ```
 java -jar <path-to-jar>/pokemons-0.0.1-DEMO.jar
 ```
- The application will be available at http://localhost:8080.

## API Endpoints
The application exposes the following RESTful API endpoints:
  - `GET /api/pokemon` : Fetch all pokemons.
  - `GET /api/pokemon/{id}` : Fetch a specific pokemon by ID.
  - `POST /api/pokemon/add` : Create a new pokemon.
  - `GET /api/pokemon/name?={name}` : Search pokemons by name or part of the name.
 
## Database
  Pokemons in the MongoDB Atlas are stored in the data schema as below
  ```
  {
    "_id":{"$oid":"64214906086cc57ee8330657"},
    "id":{"$numberInt":"2"},
    "name":"Ivysaur",
    "imageUrl":"/images/Ivysaur.png",
    "dexEntry":"When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs."
   }
  ```
  The [resource](src/main/resources/static/images/) folder contains the source file where the `imageUrl` will be navigated to and then pass the image to the frontend.
 
## Spring Boot
This application showcase a basic Spring Boot business layer model, including following parts:
 - [Collection](src/main/java/com/rrjgo/pokemons/Pokemon.java): Stores Object data schema, similar to the `models`. Using annotation:
   - `@Document(collection = "<database-name>")`: This has to match with the MongoDB database name.
   - `@Data`/`@AllArgsConstructor` / `@NoArgsConstructor`: Auto generated constructor to create corresponding data.
 - [Controller](src/main/java/com/rrjgo/pokemons/PokemonController.java): Stores all the exposed endpoint, and mapping to corresponding Service Layer method, similar to the `routes`. Using annotation:
   - `@RestController`: Define the controller class
   - `@RequestMapping("<path>")`: Define request path to the controller
   - `@GetMapping("<path>")`/ `@PostMapping("<path>")`: Define the endpoint of individual function
     - `@PathVariable` and `@RequestParam` are defined in the parameter of the method
   - `@Autowired`: The spring container will take care of the dependency injection. when detecting this annotation, it will auto generate the corresponding instance. 
 - [Service](src/main/java/com/rrjgo/pokemons/PokemonService.java): Where all the function is implemented, handle the request from the Controller Layer, similar to the `business`. Using annotation:
   - `@Service`
   - `@Autowired`: Same as described above, generate a Repository instance
 - [Repository](src/main/java/com/rrjgo/pokemons/PokemonRepository.java): This is the data access layer, interact with the data base. It extends the `MongoRepository` Class. Using annotation:
   - `@Repository`
 - [Application](src/main/java/com/rrjgo/pokemons/PokemonsApplication.java): The entry point of the application. Also includes a cors config to overcome the cors error as the frontend and backend were developed under different directory. Using annotation:
   - `@SpringBootApplication`