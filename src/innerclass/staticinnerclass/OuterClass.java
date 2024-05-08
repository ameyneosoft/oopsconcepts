package innerclass.staticinnerclass;

public class OuterClass {
    static String data = "data";
    static class InnerClass{
        static void staticMethod(){
            System.out.println("Static method inside static inner class invoked");
        }
        void nonStaticMethod(){
            System.out.println("Non -static method inside static inner class invoked");
        }
    }

    public static void main(String[] args) {
    OuterClass.InnerClass obj = new OuterClass.InnerClass();
    obj.nonStaticMethod();
    OuterClass.InnerClass.staticMethod();
    }
}
