public class SkateboardWheel {
    private int hardness; //0-100 for hardness
    private int diameter; //in mm
    private String manufacturer;
    public SkateboardWheel() {
        hardness = 50;
        diameter = 63;
        manufacturer = "Test Manufacturer";
    }
    public SkateboardWheel(int hardness, int diameter, String manufacturer) {
        this.hardness = hardness;
        this.diameter = diameter;
        this.manufacturer = manufacturer;
    }
}
        