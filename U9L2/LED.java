public class LED extends Television {
    public LED() {
        super("LED-0", 800.0);
    }
    public LED(String model, double cost) {
        super("LED-"+model, cost);
    }
    public String toString() {
        return super.toString();
    }
}