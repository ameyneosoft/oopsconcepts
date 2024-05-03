package aggregation;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class Employee {
    String name;
    String department;
    Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
