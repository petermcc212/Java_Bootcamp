public class Mouse {

    String brand;
    int numberOfButtons;
    boolean isWireless;

    public Mouse(String brand, int numberOfButtons, boolean isWireless) {
        this.brand = brand;
        this.numberOfButtons = numberOfButtons;
        this.isWireless = isWireless;
    }

    public void getMouse(){
        System.out.println("_____________________________________");
        System.out.println("The brand is " + brand);
        System.out.println("The number of buttons: " + numberOfButtons);
        if(isWireless){
            System.out.println("The keybaord is wireless");
        }
    }
}
