public class Cartoon extends Book {
    private String Name;
    
    public Cartoon(String n, String pb, double price, int yearPb) {
        super(pb, price, yearPb);
        this.Name = n;
    }
    
    public double ComputeSalePrice() {
        double rp = super.getRegularPrice();
        if (rp < 100.0) {
            return rp*0.75;
        } else {
            return rp*0.6;
        }
    }
}