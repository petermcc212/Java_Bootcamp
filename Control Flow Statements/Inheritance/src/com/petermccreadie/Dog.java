package com.petermccreadie;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail= tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // look at super class for eat method
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(20);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(40);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}


