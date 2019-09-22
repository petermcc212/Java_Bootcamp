public class DecimalComparator{


    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){

        double x = (int) (firstNumber * 1000);
        double y = (int) (secondNumber * 1000);
        System.out.println(x);
        System.out.println(y);
        if ((x-y) == 0){
            return  true;
        }
        else return false;
    }


}