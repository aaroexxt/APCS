public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int gradYear;
    private int tardies;

	private double[] grades = new double[5];
    
    public Student() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.major = "CS";
        this.gradYear = 2021;
        this.tardies = 20;

		for (int i=0; i<this.grades.length; i++) {
			this.grades[i] = 0.0;
		}
		//^Initialize all grades to 0
    }
    
    public Student(String fN, String lN, String maj, int gY, int tD, double Eng, double Mat, double Sci, double FA, double SS) {
        this.firstName = fN;
        this.lastName = lN;
        this.major = maj;
        this.gradYear = gY;
        this.tardies = tD;

		this.grades[0] = Eng;
		this.grades[1] = Mat;
		this.grades[2] = Sci;
		this.grades[3] = FA;
		this.grades[4] = SS;
    }

	public setGPA(double Eng, double Mat, double Sci, double FA, double SS) {
		this.grades[0] = Eng;
		this.grades[1] = Mat;
		this.grades[2] = Sci;
		this.grades[3] = FA;
		this.grades[4] = SS;
	}

	public double calcGPA() {
		int GPA = 0;
		for (int i=0; i<this.grades.length; i++) {
			GPA+=this.grades[i];
		}
		GPA/=this.grades.length;
		return GPA;
	}
    
    public String toString() {
        String output = new String();
        output = "Name: "+this.firstName+" "+this.lastName+", major: "+this.major+", gradYear: "+this.gradYear+", tardies: "+this.tardies;
		output+="\nGPA: "+this.calcGPA();
        return output;
    }
}