package patterns.generators.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 1;
        circle.color = "Red";
        circle.radius = 10;
        Circle anotherCircle = (Circle) circle.clone();
        if (circle.equals(anotherCircle)){
            System.out.println("bingo");
        }
    }
}
