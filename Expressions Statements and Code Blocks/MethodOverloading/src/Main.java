public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Peter", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);

//        System.out.println(calcFeetAndInchesToCentimeters(12,8));
//        System.out.println(calcFeetAndInchesToCentimeters(12));
//        System.out.println(calcFeetAndInchesToCentimeters(-1,8));
//        System.out.println(calcFeetAndInchesToCentimeters(-10));
        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;

    }


    public static double calcFeetAndInchesToCentimeters (int feet, int inches){
        if (feet < 0 ){
            return -1;
        }
        if ((inches <0) || (inches > 12)){
            return -1;
        }

        int inchesInFeet = (feet * 12);
        double convertedToCentimeters = ((inches + inchesInFeet) * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + convertedToCentimeters + " cm'");
        return convertedToCentimeters;

    }


    public static double calcFeetAndInchesToCentimeters (int inches){
        if(inches < 0 ){
            return -1;
        }
        return calcFeetAndInchesToCentimeters(0, inches);
    }

}
