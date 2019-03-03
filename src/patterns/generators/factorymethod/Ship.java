package patterns.generators.factorymethod;

public class Ship implements Transport {
    @Override
    public void transport() {
        System.out.println("transport by a ship");
    }
}
