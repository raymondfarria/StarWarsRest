package com.starwars.springboot.models;

import java.util.Arrays;

public class Vehicles {
    private String name;
    private String model;
    private String vehicleClass;
    private String length;
    private String cost;
    private String numOfCrew;
    private String numOfPassengers;
    private String maxSpeed;
    private String cargo;
    private Films[] filmArray;
    private People[] pilots;

    public Vehicles() {
        this.name = name;
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.cost = cost;
        this.length = length;
        this.numOfCrew = numOfCrew;
        this.numOfPassengers = numOfPassengers;
        this.maxSpeed = maxSpeed;
        this.cargo = cargo;
        this.filmArray = filmArray;
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
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

    public Films[] getFilms() {
        return filmArray;
    }

    public People[] getPilots() {
        return pilots;
    }

}
