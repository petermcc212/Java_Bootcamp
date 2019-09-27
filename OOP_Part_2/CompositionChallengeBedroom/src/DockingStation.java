public class DockingStation {


    private Keyboard keyboard;
    private  Mouse mouse;
    private Laptop laptop;
    private Monitor monitor;

    public DockingStation(Keyboard keyboard, Mouse mouse, Laptop laptop, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.laptop = laptop;
        this.monitor = monitor;
    }

    public void getDockingStation(){
        keyboard.getKeyboard();
        mouse.getMouse();
        laptop.getLaptop();
        monitor.getMonitor();


    }

    public Keyboard getKeyboard(){
        return this.keyboard;
    }

    public Mouse getMouse(){
        return this.mouse;
    }

    public Laptop getLaptop(){
        return this.getLaptop();
    }

    public Monitor getMonitor(){
        return this.monitor;
    }
}
