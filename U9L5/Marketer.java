public class Marketer extends Employee {
    public Marketer() {
        super();
        super.setSalary(50000);
    }
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}