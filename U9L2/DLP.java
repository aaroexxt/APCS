public class DLP extends Television {
    public DLP() {
        super("DLP-0", 500.0);
    }
    public DLP(String model, double cost) {
        super("DLP-"+model, cost);
    }
    public String toString() {
        return super.toString();
    }
}