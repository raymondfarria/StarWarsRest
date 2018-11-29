package com.starwars.springboot.models;

import java.util.Arrays;

public class Species {
    private String speciesName;
    private String classification;
    private String avgLifespan;
    private String eyeColor;
    private String skinColors;
    private String hairColors;
    private String language;
    private String homeworld;
    private People[] peopleArray;
    private Films[] filmsArray;

    public Species() {
        this.speciesName = speciesName;
        this.classification = classification;
        this.avgLifespan = avgLifespan;
        this.eyeColor = eyeColor;
        this.skinColors = skinColors;
        this.hairColors = hairColors;
        this.language = language;
        this.homeworld = homeworld;
        this.peopleArray = peopleArray;
        this.filmsArray = filmsArray;
    }

    public String getName() {
        return speciesName;
    }

    public void setName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getAvgLife() {
        return avgLifespan;
    }

    public void setAvgLife(String avgLifespan) {
        this.avgLifespan = avgLifespan;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSkinColor() {
        return skinColors;
    }

    public void setSkinColor(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getHairColor() {
        return hairColors;
    }

    public void setHairColor(String hairColors) {
        this.hairColors = hairColors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public People[] getPeople() {
        return peopleArray;
    }

    public Films[] getFilms() {
        return filmsArray;
    }

}