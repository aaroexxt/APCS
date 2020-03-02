public class StudentAdvance extends Ticket {
    private Advance internalAdvance;
    public StudentAdvance(int DIA) {
        internalAdvance = new Advance(DIA);
    }
    public double getPrice() {
        return internalAdvance.getPrice()/2.0;
    }
    
    public String toString() {
        return super.toString()+"\nStudent ID Required";
    }
}