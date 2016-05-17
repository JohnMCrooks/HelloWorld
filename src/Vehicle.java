/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Vehicle {
    int wheels;
    String color;
    String make;
    String model;
    int year;

    public Vehicle(int wheels, String color, String make, String model, int year) {
        this.wheels = wheels;
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        if (isFord(newMake)) {
            this.make = "Piece of S**t";
        } else {
            this.make = newMake;;
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

// I've never had good luck with fords
    public boolean isFord(String newMake){
        if (newMake.equalsIgnoreCase("ford")){
            return true;
        }else {
            return false;
        }}
    }


