public class ChildrenBook extends Book {
    private int Age;
    
    public ChildrenBook(int a, String pb, double price, int yearPb) {
        super(pb, price, yearPb);
        this.Age = a;
    }
    
    public double ComputeSalePrice() {
        double rp = super.getRegularPrice();
        if (Age < 6) {
            return rp*0.6;
        } else {
            return rp*0.8;
        }
    }
}