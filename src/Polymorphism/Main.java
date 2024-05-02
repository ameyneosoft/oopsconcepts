package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal sparrow = new Bird();
        sparrow.makeSound();

        Animal starFish = new AquaticAnimal();
        starFish.move();

    }
}