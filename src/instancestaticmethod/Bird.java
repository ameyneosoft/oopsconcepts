package instancestaticmethod;

public class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bird is chripping");
    }
    public static void eat() {
        System.out.println("Bird is eating");
    }
}
