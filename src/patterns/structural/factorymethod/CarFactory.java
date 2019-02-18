package patterns.structural.factorymethod;

public class CarFactory extends AbstractTransportFactory {
    @Override
    public Transport getTransport() {
        return new Car();
    }
}
