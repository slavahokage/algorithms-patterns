package patterns.generators.builder;

public class Manual {

    private String type;

    private Integer seat;

    private String engine;

    private String transmision;

    private String tripComputer;

    private String gpsNavigator;

    public Manual(String type, Integer seat, String engine, String transmision, String tripComputer, String gpsNavigator) {
        this.type = type;
        this.seat = seat;
        this.engine = engine;
        this.transmision = transmision;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seat + "\n";
        info += "Engine: " + engine;
        info += "Transmission: " + transmision + "\n";
        info += "TripComputer " + tripComputer + "\n";
        info += "gpsNavigator " + gpsNavigator + "\n";

        return info;
    }
}