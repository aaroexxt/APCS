public class Cylinder {
    private Circle base;
    private double height;
    
    public Cylinder(double r, double h) {
        Circle cBase = new Circle(r);
        this.base = cBase;
        this.height = h;
    }
    
    public String toString() {
        String output = new String();
        output+="Height: "+this.height+", Radius: "+this.base.getRadius();
        return output;
    }
    
    public double getSurfaceArea() {
        return (2*Math.PI*this.base.getRadius()*this.height) + (2*this.base.getArea());
    }
}