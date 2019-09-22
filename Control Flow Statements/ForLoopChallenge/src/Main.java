public class Main {


    public static void main(String[] args) {

        int totalNumber = 0;
        int totalsum = 0;
        for(int i = 1; i<1001; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    totalNumber ++;
                    totalsum += i;
                    System.out.println("Found number is " + i);
                    if (totalNumber == 5){
                        break;
                    }
                }
            }
        }
        System.out.println("The sum of numbers which can be divided by both " +
                "3 and 5 is: " + totalsum);


//        System.out.println(SumOddRange.sumOdd(1,11));
        System.out.println(SumOddRange.sumOdd(20,30));
//        System.out.println(SumOddRange.isOdd(10));
    }
}
