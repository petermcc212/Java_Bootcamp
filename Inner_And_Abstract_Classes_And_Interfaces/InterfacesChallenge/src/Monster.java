import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{

    String monsterName;
    int height;
    String mostScaryAttribute;


    public Monster( String monsterName, int height, String mostScaryAttribute){
        this.monsterName = monsterName;
        this.height = height;
        this.mostScaryAttribute = mostScaryAttribute;
    }


    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMostScaryAttribute() {
        return mostScaryAttribute;
    }

    public void setMostScaryAttribute(String mostScaryAttribute) {
        this.mostScaryAttribute = mostScaryAttribute;
    }

    @Override
    public List<String> write() {
        List toWrite = new ArrayList<String>();
        toWrite.add(0,"Monster name: " + monsterName);
        toWrite.add(1, "Height: " + height);
        toWrite.add(2, "Most scary attribute: " + mostScaryAttribute);
        return toWrite;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null || savedValues.size()>0){
            this.setMonsterName(savedValues.get(0));
            this.setHeight(Integer.parseInt(savedValues.get(1)));
            this.setMostScaryAttribute(savedValues.get(2));

        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                ", height=" + height +
                ", mostScaryAttribute='" + mostScaryAttribute + '\'' +
                '}';
    }
}
