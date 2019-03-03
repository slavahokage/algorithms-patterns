package patterns.generators.builder;

public class Car {

    private String type;

    private Integer seat;

    private String engine;

    private String transmision;

    private String tripComputer;

    private String gpsNavigator;

    public Car(String type, Integer seat, String engine, String transmision, String tripComputer, String gpsNavigator) {
        this.type = type;
        this.seat = seat;
        this.engine = engine;
        this.transmision = transmision;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String getType() {
        return type;
    }

    public Integer getSeat() {
        return seat;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGpsNavigator() {
        return gpsNavigator;
    }
}
