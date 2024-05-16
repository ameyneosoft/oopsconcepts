package multipleinheritance;

public interface Interface1 {
    default  void intmethod(){
        System.out.println("Default method of interface 1 invoked");
    }
}
