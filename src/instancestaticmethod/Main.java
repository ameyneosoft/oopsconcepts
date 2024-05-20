package instancestaticmethod;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Animal b2 = new Bird();
        b1.makeSound();
        b2.makeSound();
        b1.eat();
        b2.eat();
    }
}
