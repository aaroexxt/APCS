import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sum = 0;
        while (n>0) {
            sum+=n%10;
            n/=10; //use the property of integer not having decimals
        }
        System.out.println("Sum: "+sum);
    }
}