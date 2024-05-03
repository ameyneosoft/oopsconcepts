package accessModifiers.defaultPackage;

public class DefaultExtendingClass extends DefaultClass{
    int getDefaultVar(){
        return super.defaultVar;
    }
    public void setDefaultVar(int defaultVar){
        super.defaultVar = defaultVar;
    }
}
