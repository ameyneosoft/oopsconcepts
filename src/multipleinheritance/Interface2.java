package multipleinheritance;

public interface Interface2 {
    default  void intmethod(){
        System.out.println("Default method of interface 2 invoked");
    }
}
