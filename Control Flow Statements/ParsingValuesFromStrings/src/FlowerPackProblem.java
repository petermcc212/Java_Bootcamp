public class FlowerPackProblem {

    public static boolean canPack (int bigCount, int smallCount, int goal){

        if((bigCount < 0) || (smallCount < 0 ) || (goal < 0)){
            return false;
        }

        // multiply up big counCount
        int bigCountInKilos = bigCount * 5;
        int oneBigCount = 5;
        int getGoal = goal / oneBigCount;
        int getGoalBalance = goal - (oneBigCount * getGoal);


    }
}
