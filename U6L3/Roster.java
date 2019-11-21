public class Roster {
    private Student [] UrMom= new Student[3];
    public Roster(Student UrDad, Student Abigale, Student UrSister) {
        UrMom[0] = UrDad;
        UrMom[1] = Abigale;
        UrMom[2] = UrSister;
    }
    public Student findStudentWithMaxGPA() {
        double MaxGPA = UrMom[0].calcGPA();
        int indexMax = 0;
        for (int i = 1; i<UrMom.length; i++) {
            if (UrMom[i].calcGPA() > MaxGPA) {
                MaxGPA = UrMom[i].calcGPA();
                indexMax = i;
            }
        }
        return UrMom[indexMax];
    }
    
    public String toString(){
        Student max = findStudentWithMaxGPA();
        return max.toString();
    }
}