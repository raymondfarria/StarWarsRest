package com.starwars.springboot.models;

import java.util.List;

public class Films {
    private String title;
    private String director;
    private String producer;

    private Species[] speciesArray;
    private People[] peopleArray;
    private Vehicles[] vehiclesArray;
    private Planets[] planetsArray;
    // private List<Species> speciesList;
    // private List<People> peopleList;
    // private List<Vehicles> vehiclesList;
    // private List<Planets> planetList;

    public Films() {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.speciesArray = speciesArray;
        this.peopleArray = peopleArray;
        this.vehiclesArray = vehiclesArray;
        this.planetsArray = planetsArray;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return producer;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Species[] getSpecies() {
        return speciesArray;
    }

    public People[] getPeople() {
        return peopleArray;
    }

    public Vehicles[] getVehicles() {
        return vehiclesArray;
    }

    public Planets[] getPlanets() {
        return planetsArray;
    }

}