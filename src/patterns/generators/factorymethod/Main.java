package patterns.generators.factorymethod;

public class Main {
    public static void main(String[] args){
        AbstractTransportFactory abstractTransportFactory1 = new CarFactory();
        abstractTransportFactory1.start();

        AbstractTransportFactory abstractTransportFactory2 = new ShipFactory();
        abstractTransportFactory2.start();
    }
}
