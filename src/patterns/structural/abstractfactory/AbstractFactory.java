package patterns.structural.abstractfactory;

public abstract class AbstractFactory {
    public abstract void getChair();
    public abstract void getCoffeTable();
    public abstract void getSofa();

    public void getInformation(){
        getChair();
        getCoffeTable();
        getSofa();
    }
}
