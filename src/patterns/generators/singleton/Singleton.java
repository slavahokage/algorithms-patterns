package patterns.generators.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
    }

    public synchronized static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void printMe() {
        System.out.println(instance.hashCode());
    }
}
