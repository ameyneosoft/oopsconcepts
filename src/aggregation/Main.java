package aggregation;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Mumbai", "Maharashtra", "India");
        Employee employee = new Employee("Virat", "Health", address1);

        System.out.println(employee.toString());

    }
}
