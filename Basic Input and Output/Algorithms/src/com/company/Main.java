package com.company;

public class Main {

    public static void main(String[] args) {
	int x = 0;
	int y = 1;
	int z = 1;
	int f = 0;
        System.out.println(x);
        System.out.println(y);

        while(z<15){
            f = x+y;
            x = y;
            y = f;
            if(f%2 ==0){
                System.out.println(f);
            }
            z ++;
        }

    }
}
