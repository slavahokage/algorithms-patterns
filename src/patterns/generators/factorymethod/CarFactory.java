package patterns.generators.factorymethod;

public class CarFactory extends AbstractTransportFactory {
    @Override
    public Transport getTransport() {
        return new Car();
    }
}
