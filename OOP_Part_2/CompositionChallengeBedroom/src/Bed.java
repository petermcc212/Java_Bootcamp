public class Bed {

    String model;
    String brand;
    boolean isKingSize;
    String colour;

    public Bed(String model, String brand, boolean isKingSize, String colour) {
        this.model = model;
        this.brand = brand;
        this.isKingSize = isKingSize;
        this.colour = colour;
    }

    public void getBed(){
        System.out.println("The model of bed is: " + model);
        System.out.println("The brand of bed is " + brand);
        if(isKingSize){
            System.out.println("It is king sized");
        }else{
            System.out.println("It is not kingsize");
        }
        System.out.println("The colour of the bed is: " + colour);
    }
}
