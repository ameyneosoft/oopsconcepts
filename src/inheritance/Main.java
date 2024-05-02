package inheritance;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student(1,"Birla School");
        student1.setName("pavan");
        student1.setAge(6);
        System.out.println(student1.toString());

        User teacher1 = new Teacher("Economics");
        teacher1.setName("Rupali");
        teacher1.setAge(34);
        System.out.println(teacher1.toString());

    }
}
