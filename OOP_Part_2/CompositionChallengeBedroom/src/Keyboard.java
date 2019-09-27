public class Keyboard {

    String brand;
    String model;
    boolean isMechanical;

    public Keyboard(String brand, String model, boolean isMechanical) {
        this.brand = brand;
        this.model = model;
        this.isMechanical = isMechanical;
    }

    public void getKeyboard(){
        System.out.println("_____________________________________");
        System.out.println("The brand is " + brand);
        System.out.println("The model is " + model);
        if(isMechanical){
            System.out.println("The keyboard is mechanical");
        }
    }
}
