package com.example.test;

public class Item {

    private String name;
    private Double value;
    private int NumberAvailable;


    public Item(String name, Double value) {
        this.name = name;
        this.value = value;
    }


    public void setNumberAvailable(int numberAvailable) {
        NumberAvailable = numberAvailable;
    }

    public int getNumberAvailable() {
        return NumberAvailable;
    }

    public Double getValue() {
        return value;
    }
}
