public abstract class Animal {

    // You can add both fields and abstract methods to an abstract class

    private String name;

    int distance;


    public Animal(String name) {
        this.name = name;


    }

    public abstract void eat();
    public abstract void breathe();


    public String getName() {
        return name;
    }
}
