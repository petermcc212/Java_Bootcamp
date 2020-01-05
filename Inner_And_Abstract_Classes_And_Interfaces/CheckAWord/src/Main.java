public class Main {

    public static void main(String[] args) {


        String userInput = "bbbbb";
        char [] vowels = {'a','e','i','o','u'};
        int vowelCount = 0;


        for(int i = 0; i< userInput.length(); i++){
            for(int j = 0; j< vowels.length; j++){
                if(userInput.charAt(i) == vowels[j]){
                    vowelCount ++;
                }
            }
        }

        System.out.println("Vowel count is: " + vowelCount);
    }
}
