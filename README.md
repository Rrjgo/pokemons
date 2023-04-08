# Pokemons-SpringBoot

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0--M2-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
![MongoDB Atlas](https://img.shields.io/badge/MongoDB-%20Atlas-orange)

This is a sample Java / Spring Boot / MongoDB application that serves as a Tech Demo for exploring Java Web Application backend development.

## Table of Contents
  - [Overview](#overview)
  - [Running the Application](#running-the-application)
  - [API Endpoints](#api-endpoints)

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
 
  
 

