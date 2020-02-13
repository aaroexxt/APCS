public class recursionstuff {
    public static int sumDigits(int n) {
        if (n <= 10) {
            return n;
        } else {
            return (n%10)+sumDigits(n/10); //digit plus sum of rest
        }
    }
    
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies%2 == 0) {
            return 3+bunnyEars(bunnies-1);
        } else if (bunnies%2 == 1) {
            return 2+bunnyEars(bunnies-1);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        
        System.out.println(bunnyEars(3));
    }
}