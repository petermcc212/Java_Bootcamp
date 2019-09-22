public class PrintingFactors {

    public static void printFactors (int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int factorTotal= 0;
        for(int i = 1; i< number+ 1; i ++){
            if( number % i == 0){
                factorTotal ++;
                System.out.println(i);
            }

        }
    }
}
