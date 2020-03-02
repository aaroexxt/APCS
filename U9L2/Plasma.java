public class Plasma extends Television {
    public Plasma() {
        super("Plasma-0", 500.0);
    }
    public Plasma(String model, double cost) {
        super("Plasma-"+model, cost);
    }
    public String toString() {
        return super.toString();
    }
}