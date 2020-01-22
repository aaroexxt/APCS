public class hw {
    //Part 1
    /*
     * a) 1
     * b) 1,2
     * c) 1,3
     */
    
    //Part 2
    /*
     * a) 113
     * b) 140,70
     * c) 168,84,42
     * d) 120,60,30
     * e) 160,80,40,20,10
     */
    
    //Part 3
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n+"...");
            countdown(n-1);
        }
    }
    
    //Part 4
    public static void descending(int n) {
        System.out.println(n);
        if (n!=1) {
            descending(n-1);
        }
    }
    
    //Part 5
    public static int exp(int x, int m) {
      if (m == 0) {
          return 1;
      } else {
          return x*exp(x, m-1);
      }
    }
    
    public static void main() {
        System.out.println("desc");
        descending(5);
        System.out.println("cdown");
        countdown(10);
        System.out.println("exp 5^3: "+exp(5,3));
        
    }
        
      
      
      
      
      
     
}