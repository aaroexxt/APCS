public class Lawyer extends Employee {
    public Lawyer() {
        super();
        super.setVacation(21);
    }
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}