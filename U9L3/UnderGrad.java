public class UnderGrad extends Student {
    public UnderGrad(String fN, String maj, int uT) {
        super(fN, maj, uT);
    }
    public int calculateTuition() {
        return super.getUnitsTaken()*250;
    }
    public int calculateTuition(int units) {
        return units*250;
    }
}