import java.util.ArrayList;
import java.util.List;

public class Player implements  ISavable {

    private String playerName;
    private int highScore;
    private int strength;
    private String weapon;


    public Player(String playerName, int highScore, int strength) {
        this.playerName = playerName;
        this.highScore = highScore;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", highScore=" + highScore +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.playerName);
        values.add(1, "" + this.highScore);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);


        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue != null && savedValue.size()> 0){
            this.playerName = savedValue.get(0);
            this.highScore = Integer.parseInt(savedValue.get(1));
            this.strength = Integer.parseInt(savedValue.get(2));
            this.weapon = savedValue.get(3);


        }


    }
}
