public class SkateboardDeck {
    private int width; //in inches
    private int length; //in inches
    private boolean gripTapePresent;
    private String manufacturer;
    public SkateboardDeck() {
        width = 8;
        length = 32;
        gripTapePresent = true;
        manufacturer = "Globe Skateboards";
    }
    public SkateboardDeck(int width, int length, boolean gTP, String manufacturer) {
        this.width = width;
        this.length = length;
        this.gripTapePresent = gTP;
        this.manufacturer = manufacturer;
    }
}