package patterns.structural.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printMe();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.printMe();

    }
}
