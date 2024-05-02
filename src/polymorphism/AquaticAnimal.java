package polymorphism;

public class AquaticAnimal extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Aquatic animal is making swimming sound");
    }

    public void move(){
        System.out.println("Aquatic Animal is swimming");
    }
}
