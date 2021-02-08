package com.company;

public class Main {

    public static void main(String[] args) {

        Cooker inductionHob = new Cooker("Indesit", "black", false, false);
        Microwave portableMicrowave = new Microwave("LG", "new yin", 240);
        Kettle kettle = new Kettle("SMEG", "fancy", "white", true );

        Kitchen newKitchen = new Kitchen("White", "laminate", false, inductionHob, portableMicrowave, kettle);

        newKitchen.buildTheKitchen();





    }
}
