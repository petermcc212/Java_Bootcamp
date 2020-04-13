package com.example.test;

public class Planet extends HeavenlyBody{


    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }


    // making sure only moons are added as satellites to a planet
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}
