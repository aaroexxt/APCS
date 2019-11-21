import java.util.*;
import java.io.*;
public class Roster2 {
    private ArrayList<Student> myStudents = new ArrayList<Student>();
    public Roster2 (Student S1, Student S2, Student S3) {
        myStudents.add(S1);
        myStudents.add(S2);
        myStudents.add(S3);
    }
    public Roster2(){
    }
    
    public void addStudent(Student newStudent) {
        myStudents.add(newStudent);
    }
    public void dropStudent(String LastName) {
        for (int i = 0; i<myStudents.size();i++) {
            if (LastName.equals(myStudents.get(i).getLastName())) {
                myStudents.remove(i);
            }
        }
    }
    public String toString() {
        return myStudents.toString();
    }
}   