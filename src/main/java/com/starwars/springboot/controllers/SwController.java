package com.starwars.springboot.controllers;

import java.util.List;
import java.util.Arrays;

import com.starwars.springboot.models.Films;
import com.starwars.springboot.models.People;
import com.starwars.springboot.models.Species;
import com.starwars.springboot.models.Vehicles;
import com.starwars.springboot.starwarsservices.StarWarsService;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwController {

    @Autowired
    private StarWarsService swService;

    @GetMapping("/species/")
    public Species[] retrieveAllSpecies() {
        return swService.getAllSpecies();
    }

    @GetMapping("/species/{id}")
    public Species specificSpecies(@PathVariable String speciesName) {
        return swService.getSpecies(speciesName);
    }

    @GetMapping("/people/")
    public People[] consumeAllPeople() {
        return swService.getAllPeople();
    }

    @GetMapping("/people/{id}")
    public People consumePeople(@PathVariable String person) {
        return swService.getPeople(person);
    }

    @GetMapping("/films/")
    public Films[] consumeAllFilms() {
        return swService.getAllFilms();
    }

    @GetMapping("/films/{id}")
    public Films consumeFilms(@PathVariable String title) {
        return swService.getFilms(title);
    }

    @GetMapping("/vehicles/")
    public Vehicles[] consumeAllVehicles() {
        return swService.getAllVehicles();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicles comsumeVehicles(@PathVariable String name, @PathVariable String model) {
        return swService.getVehicles(name, model);
    }

}