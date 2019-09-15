import java.util.Scanner;
public class PrimeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to test");
        int num = input.nextInt();
        
        boolean prime = true;
        int counter = num-1;
        while (counter > 1) { //loop over everything except for number and 1
            if (num%counter == 0) {
                System.out.println("Number is not prime");
                prime = false;
                break;
            }
            counter--;
        }
        if (prime) {
            System.out.println("Number is prime");
        }
    }
}