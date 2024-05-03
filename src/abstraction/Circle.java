package abstraction;

public class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return this.radius * this.radius;
    }
}
