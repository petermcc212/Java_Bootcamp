package com.company;

import java.util.Arrays;

public class ReverseArray {


    public void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int [] reversedArray = new int[array.length];
        int position = array.length-1;
        for(int i = 0; i< reversedArray.length; i++){
            reversedArray[i] = array[position];
            position -=1;
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
