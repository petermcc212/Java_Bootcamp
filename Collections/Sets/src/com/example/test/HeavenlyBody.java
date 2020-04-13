package com.example.test;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon (HeavenlyBody moon){
        return  this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    // checks to see if object is equal to itself (hashcode)
    // i.e. same object in memory

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        // check for null to make sure you don't get a null pointer error
        // also check to make sure the object is a HeavenlyBody
        if((obj == null)|| (obj.getClass() != this.getClass())){
            return false;
        }
        // Cast as HeavenlyBody
        String objectName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objectName);
    }

    @Override
    public int hashCode() {
        // guarantees you get a non-zero number returned for each of our hashes
        System.out.println("hash code called");
        return this.name.hashCode() + 57;
    }
}
