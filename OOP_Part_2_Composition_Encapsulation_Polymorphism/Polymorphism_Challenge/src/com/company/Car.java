package com.company;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;



    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return this.getClass().getSimpleName()  + " is braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
