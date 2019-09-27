public class Laptop {

    String brand;
    String model;
    String processor;
    int hoursOfBattery;
    boolean isMac;

    public Laptop(String brand, String model, String processor, int hoursOfBattery, boolean isMac) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.hoursOfBattery = hoursOfBattery;
        this.isMac = isMac;
    }


    public void getLaptop(){
        System.out.println("_____________________________________");
        System.out.println("The brand of the laptop is " + brand);
        System.out.println("The model: " + model);
        System.out.println("The processor: " + processor);
        System.out.println("The number of hours the laptop will run on battery is " + hoursOfBattery);
        if(isMac){
            System.out.println("The computer is a mac");
        }
    }
}
