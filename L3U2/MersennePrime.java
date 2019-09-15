import java.util.Scanner;
public class MersennePrime {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Mersenne Prime Finder... by Aaron Becker");
        
        int maxCounter = 1000;
        int primesFound = 0;
        int counter = 1;
        while (primesFound < 6 && maxCounter > 0) {
            maxCounter--;
            int prime = (int)Math.pow(2,counter)-1;
            if (testPrime(prime)) {
                System.out.println("Prime found: "+prime);
                int perfectNum = (int)Math.pow(2,counter-1)*(prime);
                System.out.println("Perfect number: "+ perfectNum);
                primesFound++;
            }
            counter++;
        }
    }
    public static boolean testPrime(int num) {
        boolean prime = true;
        int count = num-1;
        while (count > 1) { //loop over everything except for number and 1
            if (num%count == 0) {
                prime = false;
                break;
            }
            count--;
        }
        return prime;
    }
}