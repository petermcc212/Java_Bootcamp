public class Desk {


    private DockingStation dockingStation;
    private int length;
    private boolean hasPens;

    public Desk(DockingStation dockingStation, int length, boolean hasPens) {
        this.dockingStation = dockingStation;
        this.length = length;
        this.hasPens = hasPens;


    }

    public void getDesk(){
        System.out.println("_____________________________________");
        System.out.println("The length of the desk is :" + length);
        if(hasPens){
            System.out.println("The desk has pens");
        }
        dockingStation.getDockingStation();

    }
}
