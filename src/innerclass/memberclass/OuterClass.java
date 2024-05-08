package innerclass.memberclass;

public class OuterClass {
    class InnerClass{
        public void msg(){
            System.out.println("Printing from inner class");
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.msg();

    }
}
