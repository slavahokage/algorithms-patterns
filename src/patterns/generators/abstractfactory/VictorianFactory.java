package patterns.generators.abstractfactory;

public class VictorianFactory extends AbstractFactory {
    @Override
    public void getChair() {
        System.out.println("Victorian chair");
    }

    @Override
    public void getCoffeTable() {
        System.out.println("Victorian Coffe table");
    }

    @Override
    public void getSofa() {
        System.out.println("Victorian Sofa");
    }
}
