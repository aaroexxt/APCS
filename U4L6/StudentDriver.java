public class StudentDriver {
    public static void main(String[] args) {
        Student collegeStudent1 = new Student();
        System.out.println(collegeStudent1);
        
        Student collegeStudent2 = new Student("Aaron", "Becker", "EECS", 2021, 2);
        System.out.println(collegeStudent2);
    }
}