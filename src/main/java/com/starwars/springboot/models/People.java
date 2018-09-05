package com.starwars.springboot.models;

import java.util.List;



public class People{
    private String name;
    private String birthYear;
    private String gender;
    private String height;
    private String mass;
    private String skinColor;
    private String homeWorld;
    private List<Films> films;
    private List<Species> species;
    private List<StarShips> starShips;
    private List<Vehicles> vehicles;

    public People(){

    }

    public People(String name, String birthYear, String gender, String height, String mass, String skinColor, String homeWorld, List<Films> films, List<Species> species, List<StarShips> starShips, List<Vehicles> vehicles){
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.height = height;
        this.mass = mass;
        this.skinColor = skinColor;
        this.homeWorld = homeWorld;
        this.films = films;
        this.species = species;
        this.starShips = starShips;
        this.vehicles = vehicles;
    }

    


}