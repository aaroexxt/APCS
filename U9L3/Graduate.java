public class Graduate extends Student {
    public Graduate(String fN, String maj, int uT) {
        super(fN, maj, uT);
    }
    public int calculateTuition() {
        return super.getUnitsTaken()*500;
    }
    public int calculateTuition(int units) {
        return units*500;
    }
}