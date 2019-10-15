public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int gradYear;
    private int tardies;
    
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.major = "CS";
        this.gradYear = 2021;
        this.tardies = 20;
    }
    
    public Student(String fN, String lN, String maj, int gY, int tD) {
        this.firstName = fN;
        this.lastName = lN;
        this.major = maj;
        this.gradYear = gY;
        this.tardies = tD;
    }
    
    public String toString() {
        String output = new String();
        output = "Name: "+this.firstName+" "+this.lastName+", major: "+this.major+", gradYear: "+this.gradYear+", tardies: "+this.tardies;
        return output;
    }
}