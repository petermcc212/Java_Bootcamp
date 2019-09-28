public class Main {


    public static void main(String[] args) {
//        Burger burger = new Burger("Standard burger");
//        burger.addBacon();
//        burger.addCheese();
//        burger.addLettuce();
//        burger.addTomato();
//        burger.calculatePrice();


//        HealthyHamburger hb = new HealthyHamburger("HealthyBurger");
//        hb.addFlaxseed();
//        hb.addKale();
//        hb.addBacon();
//        hb.addCheese();
//        hb.addLettuce();
//        hb.addTomato();
//        hb.calculatePrice();
//        hb.getPrice();



        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("lentils", 3.41);
        System.out.println("Total healthy burger price is £ " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("should not do this", 100.00);
        db.itemizeHamburger();

    }

}
