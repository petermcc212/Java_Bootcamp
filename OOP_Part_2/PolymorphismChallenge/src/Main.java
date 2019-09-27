public class Main {
    public static void main(String[] args) {

        Car generic = new Car(4, "generic");
        System.out.println(generic.getName());
        System.out.println(generic.startEngine());
        System.out.println(        generic.accelerate());
        System.out.println(        generic.reduceSpeed());

        Audi petersAudi = new Audi(8, "A4");
        System.out.println(petersAudi.getName());
        System.out.println(petersAudi.startEngine());
        System.out.println(petersAudi.accelerate());
        System.out.println(petersAudi.reduceSpeed());

        Porsche porsche = new Porsche(4, "Cayenne");
        System.out.println(porsche.getName());
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.reduceSpeed());


        Mitsubishi mit = new Mitsubishi(8, "Outlander");
        System.out.println(mit.getName());
        System.out.println(mit.startEngine());
        System.out.println(mit.accelerate());
        System.out.println(mit.reduceSpeed());



    }
}


class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car (int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }


    public int cylinders(){
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> Engine starting... engine started";
    }

    public String accelerate(){
        return "Car -> Car is accelerating...";
    }
    public String reduceSpeed(){
        return  "Car -> Car is breaking!....";
    }
}

class Audi extends Car{
    public Audi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Audi A4 here... glow plugs heating up... car started";
    }

    @Override
    public String accelerate(){
        return "Turbo allowing for fast acceleration. Audi accelerating";
    }

    @Override
    public String reduceSpeed(){
       return "Breaks are old... this could take a while... breaking...";
    }


}


class Porsche extends Car{


    public Porsche(int cylinders, String name){
        super(cylinders, name);

    }

    @Override
    public String startEngine() {
        return "Porsche here. Petrol turbo so fast start";
    }

    @Override
    public String accelerate() {
      return "Porsche  --> rapid acceperation ";
    }

    @Override
    public String reduceSpeed() {
        return "Porsche --> Rapid breaking";
    }
}

class Mitsubishi extends Car{


    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Mitsubishi --> Engine start";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerating";
    }

    @Override
    public String reduceSpeed() {
        return "Mitsubishi --> Breaking";
    }
}

