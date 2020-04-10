public class SomeClass {

    private static int classCounter = 0;
    public final int instancenumber;
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classCounter ++;
        instancenumber = classCounter;
        System.out.println(name + " created, instance is " + instancenumber);
    }

    public int getInstancenumber(){
        return instancenumber;
    }
}
