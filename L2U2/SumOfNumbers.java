import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        /****** PART A
        int sum = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Enter number "+(i+1)+" out of 10");
            sum+=input.nextInt();
        }
        System.out.println("The sum of the numbers you entered is: "+sum);
         */
        
        /****** PART B
        int sum = 0;
        boolean adding = true;
        
        System.out.println("Enter number 1 out of 10"); //need to get the first digit because the first 2 digits need to be positive (based on Ms. Wade's example)
        sum = input.nextInt();
        for (int i=1; i<10; i++) {
            System.out.println("Enter number "+(i+1)+" out of 10");
            System.out.println(adding);
            sum+=(adding)?input.nextInt():-input.nextInt();
            adding = !adding;
        }
        System.out.println("The sum of the numbers you entered is: "+sum);
        */
        
    }
}