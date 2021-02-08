package com.company;

public class Microwave {
    private String make;
    private String model;
    private int powerRating;


    public Microwave(String make, String model, int powerRating) {
        this.make = make;
        this.model = model;
        this.powerRating = powerRating;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
