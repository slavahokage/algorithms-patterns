package patterns.generators.builder;

public class CarBuilder implements Builder {

    private String type;

    private Integer seat;

    private String engine;

    private String transmision;

    private String tripComputer;

    private String gpsNavigator;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seat = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(String gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seat, engine, transmision, tripComputer, gpsNavigator);
    }
}
