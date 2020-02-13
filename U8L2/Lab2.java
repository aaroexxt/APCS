public class Lab2 {
    public static int exponent(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a*exponent(a, b-1);
        }
    }
    
    public static int initialCookies(int cookies, int kids) {
        if (kids == 0) {
            return cookies;
        } else {
            return initialCookies(2*cookies, kids-1);
        }
    }
    
    public static String rotateLeft(String word, int n) {
        if (n == 0) {
            return word;
        } else {
            word = word.substring(word.length()-1, word.length())+word.substring(0, word.length()-1);
            return rotateLeft(word, n-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Exponent 5^3: "+exponent(5, 3));
        System.out.println("Final cookies: 15, kids 3: "+initialCookies(15, 3));
        System.out.println("Rotate left: BCS201, n=2: "+rotateLeft("BCS201", 2));
    }
}