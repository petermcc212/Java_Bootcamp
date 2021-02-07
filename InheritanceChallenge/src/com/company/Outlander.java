package com.company;

public class Outlander extends Car{

    private int roadServiceMonths;

    public Outlander(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super(name, size, wheels, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }
}
