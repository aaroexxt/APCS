public class PostGraduate extends Student {
    public PostGraduate(String fN, String maj, int uT) {
        super(fN, maj, uT);
    }
    public int calculateTuition() {
        return super.getUnitsTaken()*750;
    }
    public int calculateTuition(int units) {
        return units*750;
    }
}