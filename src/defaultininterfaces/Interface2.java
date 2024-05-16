package defaultininterfaces;

public interface Interface2 extends Interface1{
    default void defaultMethod(){
        System.out.println("default method from interface2");
    };
}
