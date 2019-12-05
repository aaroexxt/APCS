public class SkateboardWheel {
    private int hardness; //0-100 for hardness
    private int diameter; //in mm
    private String manufacturer;
    /*
     * CONSTRUCTORS
     */
    public SkateboardWheel() {
        hardness = 50;
        diameter = 63;
        manufacturer = "Test Manufacturer";
    }
    public SkateboardWheel(int hardness, int diameter, String manufacturer) {
        if (hardness < 0 || diameter < 0) {
            SkateboardWheel defaultWheel = new SkateboardWheel(); //Overload with default constructor
            this.hardness = defaultWheel.hardness;
            this.diameter = defaultWheel.diameter;
            throw new IllegalArgumentException();
        } else {
            this.hardness = hardness;
            this.diameter = diameter;
        }
        this.manufacturer = manufacturer;
    }
    /*
     * GETTERS/SETTERS
     */
    public int getHardness() {
        return hardness;
    }
    public int getDiameter() {
        return diameter;
    }
    /*
     * TOSTRING
     */
    public String toString() {
        return "Hardness: "+hardness+", diameter: "+diameter+", manufacturer: "+manufacturer;
    }
}
        