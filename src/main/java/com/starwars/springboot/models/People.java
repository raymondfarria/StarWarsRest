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

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getBirthYear(){
        return birthYear;
    }

    public void setBirthdYear(String birthYear){
        this.birthYear = birthYear;
    }
    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getHeight(){
        return height;
    }

    public void setHeight(String height){
        this.height = height;
    }
    public String getMass(){
        return mass;
    }

    public void setMass(String mass){
        this.mass = mass;
    }
    public String getSkinColor(){
        return skinColor;
    }

    public void setSkinColor(String skinColor){
        this.skinColor = skinColor;
    }
    public String getHomeWorld(){
        return homeWorld;
    }

    public void setHomeWorld(String homeWorld){
        this.homeWorld = homeWorld;
    }

    public List<Films> getFilms(){
        return films;
    }
    public List<Species> getSpecies(){
        return species;
    }
    public List<StarShips> getStarShips(){
        return starShips;
    }
    public List<Vehicles> getVehicles(){
        return vehicles;
    }

    


}