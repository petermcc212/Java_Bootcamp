public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){

        // checking for invalid value
        if( (first < 10) || (second < 10)){
            return -1;
        }
        while ( first != second){
            if(first > second){
                first -= second;
            }else{
                second -= first;
            }
        }
        System.out.println("Greatest common dividor = " + first);
        return first;
    }
}
