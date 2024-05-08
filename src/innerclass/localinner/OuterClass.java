package innerclass.localinner;

public class OuterClass {
    public static void main(String[] args) {
        class Local{
            String val = "value";
            public void localmethod(){
                System.out.println("Local Inner class method invoked with " + val);
            }
        }
        Local local = new Local();
        local.localmethod();
    }
}
