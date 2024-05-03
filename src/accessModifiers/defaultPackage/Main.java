package accessModifiers.defaultPackage;

public class Main {
    public static void main(String[] args) {
        DefaultExtendingClass dec = new DefaultExtendingClass();
        dec.setDefaultVar(2);
        System.out.println(dec.getDefaultVar());
    }
}
