package accessModifiers;


import accessModifiers.defaultPackage.DefaultExtendingClass;
import accessModifiers.privatePackage.PrivateClass;
import accessModifiers.publicPackage.PublicClass;

public class Main {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();

        PrivateClass pvtClass = new PrivateClass();
        pvtClass.setPvtVar(2);
        System.out.println(pvtClass.toString());

        ExtendingProtectedClass a = new ExtendingProtectedClass();
        a.setProtectedVar(3);
        System.out.println(a.toString());




    }



}
