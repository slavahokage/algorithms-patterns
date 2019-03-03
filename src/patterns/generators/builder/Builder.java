package patterns.generators.builder;

public interface Builder {

    void setType(String type);

    void setSeats(int seats);

    void setEngine(String type);

    void setTransmission(String type);

    void setTripComputer(String type);

    void setGPSNavigator(String type);
}
