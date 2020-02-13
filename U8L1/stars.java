public class stars {
    public static void printStars(int n) {
        if (n == 0) {
            System.out.println();
            return;
        } else {
            System.out.print("*");
            printStars(n-1);
        }
    }
    
    public static void printTriangleIterativeA(int n) {
        for (int i=1; i<=n; i++) {
            printStars(i);
        }
    }
    
    public static void printTriangleIterativeB(int n) {
        for (int i=n; i>0; i--) {
            printStars(i);
        }
    }
    
    public static void printTriangleRecursiveA(int n) {
        printTriangleRecursiveAReal(n, n);
    }
    
    public static void printTriangleRecursiveAReal(int n, int max) {
        if (n == 0) {
            return;
        } else {
            printStars(max-(n-1));
            printTriangleRecursiveAReal(n-1, max);
        }
    }
    
    public static void printTriangleRecursiveB(int n) {
        if (n == 0) {
            return;
        } else {
            printStars(n);
            printTriangleRecursiveB(n-1);
        }
    }
    
    public static void main() {
        System.out.println("IA");
        printTriangleIterativeA(5);
        System.out.println("RA");
        printTriangleRecursiveA(5);
        
        System.out.println("IB");
        printTriangleIterativeB(5);
        System.out.println("RB");
        printTriangleRecursiveB(5);
    }
}
    
    