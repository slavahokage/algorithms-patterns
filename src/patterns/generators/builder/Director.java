package patterns.generators.builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType("sport car");
        builder.setSeats(2);
        builder.setEngine("sport car engine");
        builder.setTransmission("semi automatic");
        builder.setTripComputer("sport car trip computer");
        builder.setGPSNavigator("sport car gps navigaot");
    }

    public void constructCityCar(Builder builder) {
        builder.setType("city car");
        builder.setSeats(2);
        builder.setEngine("city car engine");
        builder.setTransmission("semi automatic");
        builder.setTripComputer("city car trip computer");
        builder.setGPSNavigator("city car gps navigaot");
    }

    public void constructSUV(Builder builder) {
        builder.setType("suv car");
        builder.setSeats(2);
        builder.setEngine("suv car engine");
        builder.setTransmission("semi automatic");
        builder.setTripComputer("suv car trip computer");
        builder.setGPSNavigator("suv car gps navigaot");
    }
}
