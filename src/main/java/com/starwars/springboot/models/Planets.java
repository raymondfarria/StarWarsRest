package com.starwars.springboot.models;

import java.util.List;

public class Planets{
    private String name;
    private String diameter;
    private String population;
    private String climate;
    private String terrain;
    private List<String> famousResidents;

    public Planets(){

    }

    public Planets(String name, String diameter, String population, String climate, String terrain, List<String> famousResidents){
        this.name = name;
        this.diameter = diameter;
        this.population = population;
        this.climate = climate;
        this.terrain = terrain;
        this.famousResidents = famousResidents;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getDiameter(){
        return diameter;
    }

    public void setDiameter(String diameter){
        this.diameter = diameter;
    }
    public String getPopulation(){
        return population;
    }

    public void setPopulation(String population){
        this.population = population;
    }
    public String getTerrain(){
        return terrain;
    }

    public void setTerrain(String terrain){
        this.terrain = terrain;
    }
    public String getClimate(){
        return climate;
    }

    public void setClimate(String climate){
        this.climate = climate;
    }
    public List<String> getFamousResidents(){
        return famousResidents;
    }

    @Override
    public String toString(){
        return String.format(l, format, args)
    } 

    


}