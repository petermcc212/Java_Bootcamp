public class PerfectNumbers {


    public static boolean  isPerfectNumber (int number){
        if (number < 1){
            return  false;
        }

        int countingFactors = 0;
        for(int i = 1; i< number; i ++ ){
            if(number % i == 0){
                countingFactors += i;
            }
            if(countingFactors == number){
                System.out.println("Perfect number");
                return true;
            }
        }
        return false;
    }


}
