public class Fraction { //Missing 
    public Fraction(int n, int d) {
        if (num%denom != 0) {
            num = n;
            denom = d;
            reduce();
        } else {
            throw new IllegalArgumentException();
        }
    }
}