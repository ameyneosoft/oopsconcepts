package abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Area of circle = " + circle.area());

        Square square = new Square(2);
        System.out.println("Area of square = " + square.area());
    }
}
