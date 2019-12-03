public class SkateboardDeck {
    private int width; //in inches
    private int length; //in inches
    private boolean gripTapePresent;
    private String manufacturer;
    /*
     * CONSTRUCTORS
     */
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
    /*
     * GETTERS/SETTERS
     */
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    /*
     * TOSTRING
     */
    public String toString() {
        return "Width: "+width+", length: "+length+", gripTapePresent: "+gripTapePresent+", manufacturer: "+manufacturer;
    }
}