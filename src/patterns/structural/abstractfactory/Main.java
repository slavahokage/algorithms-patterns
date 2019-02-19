package patterns.structural.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory victorianFactory = new VictorianFactory();
        victorianFactory.getInformation();
        AbstractFactory modernFactory = new ModernFactory();
        modernFactory.getInformation();
    }
}
