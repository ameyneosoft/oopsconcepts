package inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    String name ;
    int age;
    String address;
    User(){

    }
}
