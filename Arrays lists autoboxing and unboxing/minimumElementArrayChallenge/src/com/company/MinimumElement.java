package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static int readInteger(){
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static int[] readElements(int capacity){
        Scanner scanner = new Scanner(System.in);
        int[] elementsAsArray = new int[capacity];
        System.out.println("Enter an element ");
        for(int i = 0; i< elementsAsArray.length; i++){
            elementsAsArray[i] = scanner.nextInt();
        }
        return elementsAsArray;
    }

    public static int findMin(int[] array){
        int lowestNumber = array[0];
        for(int i = 0; i< array.length; i++){
            if(array[i] < lowestNumber){
                lowestNumber = array[i];
            }
        }
        return lowestNumber;
    }




}
