package callByValueAndReference;

public class Main {
    public static void main(String[] args) {
        int value1 = 4;
        int value2 = value1;
        value1 = 6;
        System.out.println("value1 = " + value1 +" value2 = " + value2);


        Student s1 = new Student("Sachin", 45 );
        Student s2 = s1;
        System.out.println("s1" + s1.toString() );
        System.out.println("s2" + s2.toString());

        s1.age = 50;
        System.out.println("s1" + s1.toString());
        System.out.println("s2" + s2.toString());
    }
}
