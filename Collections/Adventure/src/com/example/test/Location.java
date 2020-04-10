package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        // to check if the map passed to the constructor is null.
        // if it is then a new HashMap is constructed.
        // This is to avoid the progarm crashing
        if(exits!= null){
            this.exits = new HashMap<String, Integer>(exits);
        }else{
            this.exits = new HashMap<String, Integer>();
        }
        // exit the game for all objects in the map
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
