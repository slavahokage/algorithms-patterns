package patterns.structural.factorymethod;

public abstract class AbstractTransportFactory {
    public void prepareForTransport(){
        System.out.println("Some prepare operations ...");
    }

    public void start(){
        prepareForTransport();
        getTransport().transport();
    }

    public abstract Transport getTransport();
}
