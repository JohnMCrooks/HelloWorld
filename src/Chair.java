/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Chair {
    boolean recliner;
    String color;
    int legs;
    boolean rolling;
    boolean swivel;

    public Chair(boolean recliner, String color, int legs, boolean rolling, boolean swivel) {
        this.recliner = recliner;
        this.color = color;
        this.legs = legs;
        this.rolling = rolling;
        this.swivel = swivel;
    }

    public boolean isRecliner() {
        return recliner;
    }

    public void setRecliner(boolean recliner) {
        this.recliner = recliner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int newLegs) {
        if (validateLegs(newLegs)){
            this.legs = newLegs;
        } else {
            this.legs = 3;
        }
    }

    public boolean isRolling() {
        return rolling;
    }

    public void setRolling(boolean rolling) {
        this.rolling = rolling;
    }

    public boolean isSwivel() {
        return swivel;
    }

    public void setSwivel(boolean swivel) {
        this.swivel = swivel;
    }

// it takes 3 legs to safely sit.
    public static boolean validateLegs(int newLegs){
        if (newLegs > 3){
            return true;
        }else {
            return false;
        }
    }
}
