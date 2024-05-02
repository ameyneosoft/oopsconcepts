package encapsulation;

public class Main {
    public static void main(String[] args) {
        Vehicle i20 = new Vehicle();
        i20.setNoOfTyres(4);
        i20.setMake("Hyundai");
        System.out.println(i20.toString());
    }
}
