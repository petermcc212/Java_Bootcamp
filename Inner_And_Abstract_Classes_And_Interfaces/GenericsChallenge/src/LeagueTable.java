import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable <T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }


    public boolean add(T team){
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

    // my alt method
    public void printTeamsInLeague(){
        Collections.sort(league);
        for(int i = 0; i< league.size(); i++){
            System.out.println(" Team Name: " + league.get(i).getName() +
                    league.get(i).ranking());
        }
    }

}
