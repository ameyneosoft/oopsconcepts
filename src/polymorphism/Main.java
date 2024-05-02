package polymorphism;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.makeSound();

        AquaticAnimal starFish = new AquaticAnimal();
        starFish.move();

    }
}