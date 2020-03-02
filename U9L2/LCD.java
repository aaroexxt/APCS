public class LCD extends Television {
    public LCD() {
        super("LCD-0", 500.0);
    }
    public LCD(String model, double cost) {
        super("LCD-"+model, cost);
    }
    public String toString() {
        return super.toString();
    }
}