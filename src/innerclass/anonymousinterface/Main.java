package innerclass.anonymousinterface;

public class Main {
    public static void main(String[] args) {
        Drinkable drink1 = new Drinkable() {
            @Override
            public void drink() {
                System.out.println("Drinking drink1");
            }
        };
        drink1.drink();
    }
}
