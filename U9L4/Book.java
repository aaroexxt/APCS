public abstract class Book {
    private String Publisher;
    private double RegularPrice;
    private int YearPublished;
    
    public Book(String Publisher, double price, int yearP) {
        this.Publisher = Publisher;
        this.RegularPrice = price;
        this.YearPublished = yearP;
    }
    
    public double getRegularPrice() {
        return RegularPrice;
    }
}