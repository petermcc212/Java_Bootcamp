package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
	hamburger.addHamburgerAddition1("tomato", 0.27);
	hamburger.addHamburgerAddition2("lettuce", 0.75);
	hamburger.addHamburgerAddition3("cheese", 1.13);
	System.out.println("Total burger price is " + hamburger.itemizehamburger());

	HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
	healthyBurger.addHamburgerAddition1("Egg", 5.43);
	healthyBurger.addHealthyAddition1("Lentils", 3.41);
	System.out.println("Total Healthy burger price is " + healthyBurger.itemizehamburger());

	DeluxeBurger db = new DeluxeBurger();
	db.addHamburgerAddition3("Should not do this", 50.43);
        System.out.println("Total Deluxe Burger price is " + db.itemizehamburger());

    }

}
