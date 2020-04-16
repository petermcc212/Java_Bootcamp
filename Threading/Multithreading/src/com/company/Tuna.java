package com.company;

import java.util.Random;

public class Tuna implements Runnable {

    String name;
    int time;
    Random r = new Random();


    public Tuna(String x){
        name = x;
        time = r.nextInt(999);
    }

    @Override
    // whenever you call run(), if you type Thread.
    // i
    public void run() {
        try{
            System.out.printf("%s is sleeping for %d \n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch(Exception e){

        }
    }
}
