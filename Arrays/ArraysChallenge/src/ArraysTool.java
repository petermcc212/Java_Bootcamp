//import java.util.Scanner;
//
//public class ArraysTool {
//
//    Scanner s = new Scanner(System.in);
//
//    public void getIntegers(int[] array){
//        System.out.println("Please type in " + array.length + " integers: \n");
//        for(int i = 0; i < array.length; i ++){
//            array[i] = s.nextInt();
//        }
//
//    }
//
//    public static void printArray(int[] array){
//        System.out.println("Printing all elements of array:");
//        for(int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//
//    }
//
//    public int[] sortIntegers(int[] array){
//
////        int[] sortedArray = new int[array.length];
//
//        for(int i = 0; i<array.length-1; i++){
//            int tempNumber = 0;
//            if(array[i] > array[i+1]){
//                tempNumber = array[i];
//                array[i] = array[i+1];
//                array[i+1] = tempNumber;
//            }else{
//                continue;
//            }
//        }
//        System.out.println("Sorted array: ");
//        for(int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//
//        return array;
//
//
//
//    }
//}
