import java.util.Scanner;
public class ArrayTestUser {
    public static void main(String[] args) {
        int[] myNumbers = new int[3];
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < myNumbers.length; index++) {
            System.out.println("Enter a cool number: ");
            myNumbers[index] = input.nextInt();
        }
        for (int index = 0; index < myNumbers.length; index++) {
            System.out.println(myNumbers[index] + " ");
        }
        System.out.println("Array Length: ");
        System.out.println(myNumbers.length);
    }
}