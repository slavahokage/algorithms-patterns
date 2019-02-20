package patterns.structural.builder;

public class CarManualBuilder implements Builder {

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

    public Manual getResult() {
        return new Manual(type, seat, engine, transmision, tripComputer, gpsNavigator);
    }
}
