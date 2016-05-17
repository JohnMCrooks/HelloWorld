/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Animal {
    String name;
    String species;
    double weight;
    int length;

    public Animal(String name, String species, double weight, int length){
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.length = length;
    }

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
        this.weight = -1;

        this.length = -1;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String newSpecies) {
        if (isValidSpecies(newSpecies)) {
            this.species = newSpecies;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static boolean isValidSpecies(String newSpecies){
        return newSpecies.contains(" ");
    }


}


