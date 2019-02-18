package patterns.structural.factorymethod;

public class ShipFactory extends AbstractTransportFactory {
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
