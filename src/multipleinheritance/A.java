package multipleinheritance;

public class A implements Interface2,Interface1{
    @Override
    public void intmethod() {
        Interface2.super.intmethod();
    }
}
