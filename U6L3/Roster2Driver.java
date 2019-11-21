public class Roster2Driver {
    public static void main (String [] args) {
        String S1 = "Charlie Angel";
        String S2 = "A-A-Ron Decker";
        String S3 = "Salty Boi";
        Student YesMate = new Student (S1.split(" ")[0], S1.split(" ")[1], "Reddit", 500, 3, 4.0, 1.0, 2.0, 3.0, 4.0);
        System.out.println(YesMate);
        Student NoMate = new Student (S3.split(" ")[0], S3.split(" ")[1], "Reddit", 22, 1, 3.0, 1.0, 2.0, 3.0, 4.0);
        Student BOOOOOOOOOKer = new Student (S2.split(" ")[0], S2.split(" ")[1], "Reddit", 12, 4, 4.0, 4.0, 4.0, 10.0, 4.0);
        System.out.println(NoMate);
        System.out.println(BOOOOOOOOOKer);
        
        Roster2 ApCompSci = new Roster2();
        ApCompSci.addStudent(YesMate);
        ApCompSci.addStudent(NoMate);
        ApCompSci.addStudent(BOOOOOOOOOKer);
        System.out.println(ApCompSci);
        ApCompSci.dropStudent(YesMate.getLastName());
        System.out.println(ApCompSci);
    }
}