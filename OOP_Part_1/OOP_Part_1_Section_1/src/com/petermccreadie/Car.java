package com.petermccreadie;

public class Car {

    // defining the state of the class
    // i.e. the attributes
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model){
        // use 'this' when referring to the field of the class
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || (validModel.equals("octavia"))){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }




}
