//public class Hamburger {
//
//    private String burgerName;
//    private String rollType;
//    private String meat;
//
//    private double price;
//    private boolean lettuce;
//    private boolean tomato;
//    private boolean cheese;
//    private boolean bacon;
//
//    // additional items
//    private double lettuceCost = 0.60;
//    private double tomatoCost = 0.70;
//    private double cheeseCost = 1.00;
//    private double baconCost = 1.50;
//
//
//
//
//    public Hamburger(String burgerName, String meat, double price, String rollType ){
//
//        this.burgerName = burgerName;
//        this.meat = meat;
//        this.price = price;
//        this.rollType = "bread";
//        this.meat = "hamburger";
//
//    }
//
//    public void addLettuce(){
//        lettuce = true;
//        price += lettuceCost;
//    }
//
//    public void addTomato(){
//        tomato = true;
//        price += tomatoCost;
//
//    }
//
//    public void addCheese(){
//        cheese = true;
//        price += cheeseCost;
//
//    }
//
//    public void addBacon(){
//        bacon = true;
//        price += baconCost;
//    }
//
//    public void menu(){
//        System.out.println("Menu");
//        System.out.println("Base cost of burger: £" + price);
//        System.out.println("Add lettuce for £" + String.format("%.02f", lettuceCost));
//        System.out.println("Add tomato for £ " + String.format("%.02f", tomatoCost));
//        System.out.println("Add bacon for £ " + String.format("%.02f", baconCost));
//        System.out.println("Add cheese for £ " + String.format("%.02f", cheeseCost));
//    }
//
//
//    public void calculatePrice(){
//        System.out.println("You've ordered a " + burgerName);
//        System.out.println("On " + rollType + " roll");
//        System.out.println("Additions: ");
//        if(lettuce){
//            System.out.println("Lettuce: £" + String.format("%.02f", lettuceCost));
//        }if(tomato){
//            System.out.println("Tomato: £ " + String.format("%.02f", tomatoCost));
//        }if(cheese){
//            System.out.println("Cheese: £ " + String.format("%.02f", cheeseCost));
//        }if(bacon){
//            System.out.println("Cheese: £ " + String.format("%.02f", baconCost));
//        }
//
//    }
//
//    public double getPrice(){
//        System.out.println("The total price is: £" + price);
//        return price;
//    }
//
//}
//
//class HealthyHamburger extends Hamburger {
//
//    boolean kale;
//    double kalePrice = 2.50;
//    boolean flaxseed;
//    double flaxseedPrice = 2.00;
//
//    public HealthyHamburger(String burgerName) {
//        super(burgerName);
//        rollType = "Rye bread";
//    }
//
//    public void addKale(){
//        kale = true;
//        price += kalePrice;
//    }
//
//    public void addFlaxseed(){
//        flaxseed = true;
//        price += flaxseedPrice;
//    }
//
//    @Override
//    public void menu(){
//        super.menu();
//        System.out.println("Add kale for £" + String.format("%.02f", kalePrice));
//        System.out.println("Add flaxseed for £ " + String.format("%.02f", flaxseedPrice));
//    }
//
//
//    @Override
//    public void calculatePrice() {
//        super.calculatePrice();
//
//        if(kale){
//            System.out.println("Kale: £" + String.format("%.2f", kalePrice));
//        }if(flaxseed){
//            System.out.println("Flaxseed: £" + String.format("%.2f", flaxseedPrice));
//        }
//
//    }
//}
//
//class DeluxeHamburger extends Hamburger {
//
//    double deluxePrice = 12.99;
//    public DeluxeHamburger(){
//        super("Deluxe Burger");
//    }
//
//    @Override
//    public void menu(){
//        System.out.println("Menu");
//        System.out.println("The cost of the Deluxe burger is: £  " + deluxePrice);
//        System.out.println("This meal comes with a drink and chips");
//    }
//
//
//
//
//
//
//}
//
