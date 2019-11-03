import java.util.ArrayList;

// Has to extend from player by putting this in the diamonds <>
public class Team<T extends  Player> implements Comparable<Team<T>> {


    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;



    private ArrayList<T> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player ){
        if(members.contains(player)){
            // No need to cast here because it has to be of type Player or a class which extends Player
            System.out.println((player.getName() + " is already on the team"));
            return false;
        }else{
            members.add(player);
            System.out.println((player.getName() + " picked for team " + this.name));
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();

    }


    public void matchResult(Team<T> opponent, int ourScore, int theirScore){

        String message;

        if(ourScore > theirScore){
            won ++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied ++;
            message = " drew with " ;
        }else{
            lost ++;
            message = " lost to ";
        }
        played ++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            // updates opponent
            // to avoid an infinite loop
            opponent.matchResult(null, theirScore, ourScore);
        }
    }


    public int ranking(){
        return (won * 2 ) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if (this.ranking() < team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
