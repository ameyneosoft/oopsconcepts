package abstraction;

public class Square extends Shape{
    int side;
    Square(int side){
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
}
