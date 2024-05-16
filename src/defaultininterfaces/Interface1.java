package defaultininterfaces;

public interface Interface1 {
    void normalAbstractMethod();
    default void defaultMethod(){
        System.out.println("default method from interface1");
    }


}
