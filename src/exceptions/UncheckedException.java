package exceptions;

public class UncheckedException {
    public static void main(String[] args) {
        try {
           int n = 3;
           int d = 0;
           int val = n/d;
        }catch (ArithmeticException ae){
            System.out.println("Something went wrong");
            System.out.println(ae.toString());
        } finally {
            System.out.println("In finally block");
        }
    }
}
