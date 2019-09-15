import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("# of tests");
        int tests = input.nextInt();
        int testCount = tests;
        int sum = 0;
        
        /**** DO-WHILE
        do {
            System.out.println("Enter test score:");
            sum+=input.nextInt();
            testCount--;
        } while (testCount>0);
        */
       
       /**** WHILE
       while (testCount>0) {
           System.out.println("Enter test score:");
            sum+=input.nextInt();
            testCount--;
        }
        */
       
       /***** FOR
         for (int i=0; i<tests; i++) {
            System.out.println("Enter test score:");
            sum+=input.nextInt();
            testCount--;
        }
        */
        System.out.println("Test average: "+(double)sum/(double)tests);
    }
}