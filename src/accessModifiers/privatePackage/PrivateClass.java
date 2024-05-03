package accessModifiers.privatePackage;

public class PrivateClass {
    private int pvtVar;

    public int getPvtVar() {
        return pvtVar;
    }

    public void setPvtVar(int pvtVar) {
        this.pvtVar = pvtVar;
    }

    @Override
    public String toString() {
        return "PrivateClass{" +
                "pvtVar=" + pvtVar +
                '}';
    }
}
