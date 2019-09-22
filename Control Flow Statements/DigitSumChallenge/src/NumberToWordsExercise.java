import java.util.HashMap;
import java.util.Map;

public class NumberToWordsExercise {

    public static void numberToWords (int number){



        Map<String, String> numberPairedWord = new HashMap<>();
        numberPairedWord.put("0", "Zero");
        numberPairedWord.put("1", "One");
        numberPairedWord.put("2", "Two");
        numberPairedWord.put("3", "Three");
        numberPairedWord.put("4", "Four");
        numberPairedWord.put("5", "Five");
        numberPairedWord.put("6", "Six");
        numberPairedWord.put("7", "Seven");
        numberPairedWord.put("8", "Eight");
        numberPairedWord.put("9", "Nine");


        if(number <0){
            System.out.println("Invalid Value");
        }else{

            while(number >0){
//                int lastDigit = (number % 10);
//                System.out.println("Digit: " + lastDigit);
                if (number % 10 == 0){
                    System.out.println(numberPairedWord.get("0"));
                }if (number % 10 == 1){
                    System.out.println(numberPairedWord.get("1"));
                }if (number % 10 == 2){
                    System.out.println(numberPairedWord.get("2"));
                }if (number % 10 == 3){
                    System.out.println(numberPairedWord.get("3"));
                }if (number % 10 == 4){
                    System.out.println(numberPairedWord.get("4"));
                }if (number % 10 == 5){
                    System.out.println(numberPairedWord.get("5"));
                }if (number % 10 == 6){
                    System.out.println(numberPairedWord.get("6"));
                }if (number % 10 == 7){
                    System.out.println(numberPairedWord.get("7"));
                }if (number % 10 == 8){
                    System.out.println(numberPairedWord.get("8"));
                }if (number % 10 == 9){
                    System.out.println(numberPairedWord.get("9"));
                }

                number = (number / 10);
            }
        }

    }

    public static int reverse (int number){

        // number converted to local method variable
        // and dealing with negative  numbers
        int localNumber = 0;
        // converting number to string so we can append easily
        String localString = "";
        if(number < 0){
            localNumber = number * -1;
        }else{
            localNumber = number;
        }

        while(localNumber > 0){
            System.out.println("Digit: " + (localNumber % 10));
            localString += Integer.toString(localNumber % 10);
            localNumber /= 10;
        }
        // String check
//        System.out.println("As a string in reverse: " + localString);

        // converting back to an int
        int reversedInteger = Integer.parseInt(localString);

        // adding the negative back if it was originally negative
        if(number < 0 ){
            reversedInteger *= -1;
            System.out.println("The reversed number is " + reversedInteger);
            return reversedInteger;
        }else{
            System.out.println("The reversed number is " + reversedInteger);
            return reversedInteger;
        }

    }

    public static int getDigitCount (int number){
        if(number < 0){
            System.out.println("-1");
            return -1;
        }else{
            String numbersAsString = Integer.toString(number);
            System.out.println(numbersAsString.length());
            return numbersAsString.length();
        }
    }
}
