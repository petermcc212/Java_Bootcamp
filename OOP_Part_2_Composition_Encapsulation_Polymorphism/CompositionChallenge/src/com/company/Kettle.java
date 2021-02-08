package com.company;

public class Kettle {
    private String make;
    private String model;
    private String colour;
    private boolean isBoiled;

    public Kettle(String brand, String model, String colour, boolean isBoiled) {
        this.make = brand;
        this.model = model;
        this.colour = colour;
        this.isBoiled = isBoiled;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public boolean isBoiled() {
        return isBoiled;
    }
}
