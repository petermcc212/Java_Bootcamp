public class ChargingCentre {


    boolean hasPhonecharger;
    boolean hasLaptopCharger;
    int numberOfOutlets;
    String brand;

    public ChargingCentre(boolean hasPhonecharger, boolean hasLaptopCharger, int numberOfOutlets, String brand) {
        this.hasPhonecharger = hasPhonecharger;
        this.hasLaptopCharger = hasLaptopCharger;
        this.numberOfOutlets = numberOfOutlets;
        this.brand = brand;
    }

    public void getChargingCentre(){
        if(hasLaptopCharger){
            System.out.println("The charging station has a laptop charger");
        }
        if(hasPhonecharger){
            System.out.println("The charging station has a phone charger");
        }
        System.out.println("The charging station has "  + numberOfOutlets + " number of outlets");
        System.out.println("The brand of the charging centre is: " + brand);
    }
}
