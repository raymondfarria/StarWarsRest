package com.starwars.springboot.starwarsservices;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.starwars.springboot.models.*;

@Component
public class StarWarsService {
    Species species = new Species();
    People people = new People();
    Vehicles vehicles = new Vehicles();
    Planets planets = new Planets();
    Films films = new Films();

    private Species[] speciesArray;
    private People[] peopleArray;
    private Vehicles[] vehiclesArray;
    private Planets[] planetsArray;
    private Films[] filmsArray;

    public Species[] getAllSpecies() {
        return speciesArray;
    }

    public Species getSpecies(String speciesName) {
        for (Species x : speciesArray) {
            if (speciesName.equals(species.getName())) {
                return x;
            }
        }
        return null;
    }

    public People[] getAllPeople() {
        return peopleArray;
    }

    public People getPeople(String name) {
        for (People x : peopleArray) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }

    public Films[] getAllFilms() {
        return filmsArray;
    }

    public Films getFilms(String title) {
        for (Films x : filmsArray) {
            if (x.getTitle().equals(title)) {
                return x;
            }
        }
        return null;
    }

    public Vehicles[] getAllVehicles() {
        return vehiclesArray;
    }

    public Vehicles getVehicles(String name, String model) {
        for (Vehicles x : vehiclesArray) {
            if (x.getName().equals(name) || x.getModel().equals(model)) {
                return x;
            }
        }
        return null;
    }

}