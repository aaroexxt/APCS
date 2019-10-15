public class Circle {
    private double radius;
    
    public Circle(double r) {
        this.radius = r;
    }
    
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public String toString() {
        String output = new String();
        output+="Radius: "+this.radius+", Area: "+this.getArea();
        return output;
    }
}