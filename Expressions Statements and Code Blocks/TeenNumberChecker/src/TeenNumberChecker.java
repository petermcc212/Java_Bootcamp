public class TeenNumberChecker {


    public static boolean hasTeen (int x, int y, int z){
        if ((x > 12) && (x < 20)){
            return true;
        } else if (((y > 12) && (y < 20))){
            return true;
        } else if ((z > 12) && (z < 20)){
            return true;
        }

        return false;
    }

    public static boolean isTeen (int number){
        if ((number > 12 && number <20)){
            return true;
        }
        return false;
    }
}
