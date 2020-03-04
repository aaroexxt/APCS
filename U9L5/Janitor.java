public class Janitor extends Employee {
    public Janitor() {
        super();
        super.setHours(super.showHours()*2);
        super.setSalary(30000);
        super.setVacation(super.showVacation()/2);
    }
    public void clean() {
        System.out.println("Workin' for the man");
    }
}