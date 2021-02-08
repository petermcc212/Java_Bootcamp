package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    //constructor rollType, meat and price


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String addition, double cost){
        this.price += cost;
        addition1Name = addition;
    }

    public void addHamburgerAddition2(String addition, double cost){
        this.addition2Name = addition;
        this.price += cost;
    }

    public void addHamburgerAddition3(String addition, double cost){
        this.addition3Name = addition;
        this.price += cost;
    }

    public void addHamburgerAddition4(String addition, double cost){
        this.addition4Name = addition;
        this.price += cost;
    }


    public double itemizehamburger(){
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);

    }

    public double getPrice() {
        return price;
    }
}
