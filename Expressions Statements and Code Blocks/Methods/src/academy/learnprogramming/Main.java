package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

         score = 10000;
         levelCompleted = 8;
         bonus = 200;
         highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Peter", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Paul", highScorePosition);




    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " managed to get into position " + position +
                " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }else if ((playerScore >= 500)){
            position = 2;
        }else if ((playerScore >= 100)){
            position = 3;
        }
        return position;
    }













}
