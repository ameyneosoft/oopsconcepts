package Polymorphism;

public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bird is making wings sound");
    }

    public void move(){
        System.out.println("Bird is flying");
    }
}
