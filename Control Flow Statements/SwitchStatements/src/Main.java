public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value ==1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Was not 1 or 2");
//        }



        // break statements are vital to stop a particular code block executing
//        int switchValue = 1;
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//
//        }


        char testChar = 'D';

        switch(testChar){
            case 'A':
                System.out.println("The character is A");
                break;
            case 'B':
                System.out.println("The character is B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("The character was C, D or E");
                System.out.println("The actual character was " + testChar);
                break;
            default:
                System.out.println("The character wasn't A, B, C, D or E. ");
        }

        String month = "JANUARY";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("The month is January");
                break;

            default:
                System.out.println("Not January");
                break;
        }


    }


}
