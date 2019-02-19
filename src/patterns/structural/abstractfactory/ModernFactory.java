package patterns.structural.abstractfactory;

public class ModernFactory extends AbstractFactory {
    @Override
    public void getChair() {
        System.out.println("Modern chair");
    }

    @Override
    public void getCoffeTable() {
        System.out.println("Modern Coffe table");
    }

    @Override
    public void getSofa() {
        System.out.println("Modern Sofa");
    }
}
