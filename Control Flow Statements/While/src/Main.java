public class Main {

    public static void main(String[] args) {
        int count = 1;

        // while loop
//        while( count !=6){
//            System.out.println("Count value is " + count);
//            count ++;
//
//        }


        // while (true) loop
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count ++;
//        }

        // do while loop. Remember a do loop will run at least once
//        count = 1;
//        do{
//            System.out.println("Count value was " + count);
//            count ++;
//        }while(count != 6);

        // conventional for loop

//        count = 1;
//        for (int i = 1; i< 6; i++){
//            System.out.println("Count value was " + count);
//            count ++;
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound ++;
            if(evenNumbersFound >= 5){
                break;
            }


        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }


    public static boolean isEvenNumber (int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }




    }




}
