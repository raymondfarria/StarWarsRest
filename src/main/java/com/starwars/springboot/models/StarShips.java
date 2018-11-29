package com.starwars.springboot.models;

import java.util.Arrays;
import java.util.List;

public class StarShips {
    private String shipName;
    private String model;
    private String shipClass;
    private String cost;
    private String length;
    private String numOfCrew;
    private String numOfPassengers;
    private String maxSpeed;
    private String cargo;
    private List<StarShips> starships;

    private List<Films> filmList;
    private List<People> pilotList;

    public StarShips() {
        this.shipName = shipName;
        this.model = model;
        this.shipClass = shipClass;
        this.cost = cost;
        this.length = length;
        this.numOfCrew = numOfCrew;
        this.numOfPassengers = numOfPassengers;
        this.maxSpeed = maxSpeed;
        this.cargo = cargo;
        this.filmList = filmList;
        this.pilotList = pilotList;
    }

    public String getName() {
        return shipName;
    }

    public void setName(String shipName) {
        this.shipName = shipName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getNumOfCrew() {
        return numOfCrew;
    }

    public void setnumOfCrew(String numOfCrew) {
        this.numOfCrew = numOfCrew;
    }

    public String getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(String numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<StarShips> getAllStarships() {
        return starships;
    }

    public void setAllStarships(List<StarShips> ships) {
        this.starships = ships;
    }

}