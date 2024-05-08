package innerclass.innerinterface;

public class TestInterface implements OuterInterface.Shower{
    @Override
    public void show() {
        System.out.println("Test interface implementing inner interface show method");
    }

    public static void main(String[] args) {
        OuterInterface.Shower shower = new TestInterface();
        shower.show();

    }
}
