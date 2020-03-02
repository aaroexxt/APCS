public class StudentDriver {
    public static void main(String[] args) {
        Student[][] studentBody = new Student[3][2];
        
        studentBody[0][0] = new PostGraduate("Ash", "MechE", 10);
        studentBody[0][1] = new PostGraduate("Bash", "CE", 9);
        
        studentBody[1][0] = new Graduate("Gash", "CS", 15);
        studentBody[1][1] = new Graduate("Rash", "BS", 12);
        
        studentBody[2][0] = new UnderGrad("Smash", "Econ", 10);
        studentBody[2][1] = new UnderGrad("Mash", "Spanish", 3);
        
        System.out.println("StudentBody:");
        for (Student[] sOuter : studentBody) {
            for (Student sInner : sOuter) {
                System.out.print("firstName: "+sInner.getFName()+", major: "+sInner.getMajor()+", units: "+sInner.getUnitsTaken()+"\t");
            }
            System.out.println();
        }
    }
}