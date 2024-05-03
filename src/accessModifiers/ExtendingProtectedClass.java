package accessModifiers;

import accessModifiers.protectedPackage.ProtectedClass;

public class ExtendingProtectedClass extends ProtectedClass {
   public void setProtectedVar(int protectedVar){
       super.protectedVar = protectedVar;
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
