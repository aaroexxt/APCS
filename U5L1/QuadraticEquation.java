public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminant() {
        return (double)(this.b*this.b)-((double)(4*this.a*this.c));
    }
    
    public double getSolution1() {
        return ((-(double)this.b)+Math.sqrt(this.getDiscriminant()))/(double)(2*this.a);
    }
    
    public double getSolution2() {
        return ((-(double)this.b)-Math.sqrt(this.getDiscriminant()))/(double)(2*this.a);
    }
}