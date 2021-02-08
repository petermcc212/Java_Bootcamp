package com.company;

public class Kitchen {

    private String wallColour;
    private String flooringType;
    private boolean isOpenPlan;
    private Cooker cooker;
    private Microwave microwave;
    private Kettle kettle;


    public Kitchen(String wallColour, String flooringType, boolean isOpenPlan, Cooker cooker, Microwave microwave, Kettle kettle) {
        this.wallColour = wallColour;
        this.flooringType = flooringType;
        this.isOpenPlan = isOpenPlan;
        this.cooker = cooker;
        this.microwave = microwave;
        this.kettle = kettle;
    }

    public void buildTheKitchen(){
        System.out.println("The floor is of type " + this.flooringType);
        System.out.println("The walls are of the colour " +  this.wallColour);
        if(isOpenPlan){
            System.out.println("It is open plan");
        }else{
            System.out.println("It is not open plan");
        }
        System.out.println("The cooker is of brand " + cooker.getMake());
        System.out.println("The microwave is of power rating " + microwave.getPowerRating());
        if(kettle.isBoiled()){
            System.out.println("The kettle is boiled");
        }else{
            System.out.println("The kettle is not boiled");
        }
    }


    private String getWallColour() {
        return wallColour;
    }

    private String getFlooringType() {
        return flooringType;
    }

    private boolean isOpenPlan() {
        return isOpenPlan;
    }

    private Cooker getCooker() {
        return cooker;
    }

    private Microwave getMicrowave() {
        return microwave;
    }

    private Kettle getKettle() {
        return kettle;
    }
}
