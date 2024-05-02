package encapsulation;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Vehicle {
    private int noOfTyres;
    private String make;

    public void setNoOfTyres(int noOfTyres) {
        if(noOfTyres < 1){
            System.out.println("Invalid Tyre no");
        }
        this.noOfTyres = noOfTyres;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
