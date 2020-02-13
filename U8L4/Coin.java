public class Coin {
    private int value;
    
    public Coin(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    public String toString() {
        return "Coin value: "+Integer.toString(value);
    }
}