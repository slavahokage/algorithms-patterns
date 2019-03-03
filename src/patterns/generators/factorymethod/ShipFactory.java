package patterns.generators.factorymethod;

public class ShipFactory extends AbstractTransportFactory {
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
