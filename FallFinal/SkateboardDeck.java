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
        if (width < 0 || length < 0) {
            SkateboardDeck defaultDeck = new SkateboardDeck(); //Overload with default constructor
            this.width = defaultDeck.width;
            this.length = defaultDeck.length;
            throw new IllegalArgumentException();
        } else {
            this.width = width;
            this.length = length;
        }
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