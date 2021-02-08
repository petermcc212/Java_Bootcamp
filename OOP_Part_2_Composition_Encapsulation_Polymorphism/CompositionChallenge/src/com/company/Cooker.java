package com.company;

public class Cooker {

    private String make;
    private String colour;
    private boolean isGas;
    private boolean isFreeStanding;

    public Cooker(String make, String colour, boolean isGas, boolean isFreeStanding) {
        this.make = make;
        this.colour = colour;
        this.isGas = isGas;
        this.isFreeStanding = isFreeStanding;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public boolean isGas() {
        return isGas;
    }

    public boolean isFreeStanding() {
        return isFreeStanding;
    }
}
