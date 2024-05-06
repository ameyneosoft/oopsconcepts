package exceptions;

public class Error {
    public static void main(String[] args) {
        callRecursive();
    }
    public  static void callRecursive(){
        callRecursive();
    }
}
