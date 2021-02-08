package com.company;

public class DeluxeBurger  extends  Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Beef", 19.10  , "white");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition, double cost) {
        System.out.println("No additional items can be added");
    }

    @Override
    public void addHamburgerAddition2(String addition, double cost) {
        System.out.println("No additional items can be added");
    }

    @Override
    public void addHamburgerAddition3(String addition, double cost) {
        System.out.println("No additional items can be added");
    }

    @Override
    public void addHamburgerAddition4(String addition, double cost) {
        System.out.println("No additional items can be added");
    }
}
