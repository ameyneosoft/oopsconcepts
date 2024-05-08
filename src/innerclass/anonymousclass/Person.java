package innerclass.anonymousclass;

abstract public class Person {
    abstract void eat();

    public static void main(String[] args) {
        Person p1 = new Person() {
            @Override
            void eat() {
                System.out.println("Person is eating");
            }
        };
        p1.eat();
    }
}
