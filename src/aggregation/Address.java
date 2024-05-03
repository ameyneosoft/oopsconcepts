package aggregation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Address {
    String city;
    String state;
    String country;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
