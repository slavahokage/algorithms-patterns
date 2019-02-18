package patterns.structural.factorymethod;

public class Car implements Transport {
    @Override
    public void transport() {
        System.out.println("transport by a car");
    }
}
