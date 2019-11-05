public class VendingMachine {
    private int numCans;
    private int tokens;
    public VendingMachine() {
        numCans = 10;
        tokens = 0;
    }
    public VendingMachine(int cans) {
        numCans = cans;
        tokens = 0;
    }
    public void fillUp(int cans) {
        numCans+=cans;
    }
    public void insertToken() {
        tokens++;
        numCans--;
    }
    public int getCanCount() {
        return numCans;
    }
    public int getTokenCount() {
        return tokens;
    }
}