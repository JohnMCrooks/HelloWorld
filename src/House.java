/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class House {
    int numDoors;
    int numWindows;
    String wallColor;
    double value;

    public House(int numDoors, int numWindows, String wallColor, double value) {
        this.numDoors = numDoors;
        this.numWindows = numWindows;
        this.wallColor = wallColor;
        this.value = value;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int newDoors) {
        this.numDoors = valDoors(newDoors);
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int valDoors(int newDoors){
        if (newDoors <= 0){
            return 1;
        } else {
            return newDoors;
        }
    }
}
