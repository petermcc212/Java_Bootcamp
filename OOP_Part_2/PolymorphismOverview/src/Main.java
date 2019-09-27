

class Movie{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return ("No plot here");
    }

    public String getName(){
        return  name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }

}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends  Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Boys stuck in a maze";

    }

}

class starWars extends Movie{

    public starWars(){
        super("Star Wars");
        }

    @Override
    public String plot(){
        return "Imperial Forces try to take over the universe";
    }


}

class forgettableMovie extends Movie{

    public forgettableMovie(){
        super("Forgettable");
    }

    // No plot method


}


public class Main {

    public static void main(String[] args) {

        for(int i = 1; i< 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                                " : " + movie.getName() + " \n" +
                                "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
    // generate a random number between 1 and 5
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return  new MazeRunner();
            case 4:
                return new starWars();
            case 5:
                return new forgettableMovie();
        }
        return null;
    }


}
