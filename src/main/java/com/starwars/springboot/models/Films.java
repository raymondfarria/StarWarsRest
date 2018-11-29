package com.starwars.springboot.models;

import java.util.List;

import com.starwars.springboot.models.*;

public class Films {
    private String title;
    private String director;
    private String producer;
    private List<Films> filmsList;

    private List<Species> speciesList;
    private List<Vehicles> vehiclesList;
    private List<People> peopleList;
    private List<Planets> planetsList;

    public Films() {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.speciesList = speciesList;
        this.peopleList = peopleList;
        this.vehiclesList = vehiclesList;
        this.planetsList = planetsList;
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

    public void setFilms(List<Films> films) {
        filmsList = films;
    }

    public List<Films> getFilms() {
        return filmsList;
    }

}