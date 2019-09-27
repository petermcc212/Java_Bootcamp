public class Monitor {

    String brand;
    String model;
    int numberOfInches;
    boolean isWidescreen;
    String nativeResolution;

    public Monitor(String brand, String model, int numberOfInches, boolean isWidescreen, String nativeResolution) {
        this.brand = brand;
        this.model = model;
        this.numberOfInches = numberOfInches;
        this.isWidescreen = isWidescreen;
        this.nativeResolution = nativeResolution;
    }

    public void getMonitor(){
        System.out.println("_____________________________________");
        System.out.println("Monitor brand: " + brand);
        System.out.println("Monitor model: " + model);
        System.out.println("Number of inches diagonally: " + numberOfInches);
        if(isWidescreen){
            System.out.println("The monitor is widescreen ");
        }
        System.out.println("The native resolutioln is: " + nativeResolution);
        System.out.println("_____________________________________");

    }
}
