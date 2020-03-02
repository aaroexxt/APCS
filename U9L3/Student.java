public abstract class Student {
    private String firstName;
    private String major;
    private int unitsTaken;
    public Student(String fN, String maj, int uN) {
        firstName = fN;
        major = maj;
        unitsTaken = uN;
    }
    public int getUnitsTaken() {
        return unitsTaken;
    }
    public void setUnitsTaken(int nU) {
        this.unitsTaken = nU;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String nM) {
        this.major = nM;
    }
    public String getFName() {
        return firstName;
    }
    public void setFName(String nN) {
        this.firstName = nN;
    }
    abstract public int calculateTuition(int units);
}