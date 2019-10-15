import java.util.Scanner;
public class Level2 {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int a = promptNumber("A"); //assign a and b
        int b = promptNumber("B");
        System.out.print("The value of a is "+a+" and it is ");
        if (a>b) {
            System.out.print("greater than ");
        } else if (a<b) {
            System.out.print("less than ");
        } else {
            System.out.print("equal to ");
        }
        System.out.println("b whose value is "+b);
    }
    public static int promptNumber(String ident) {
        System.out.println("Input number \""+ident+"\"");
        return input.nextInt();
    }
    
    /***** QUESTION 3
     * If the original price is 95, the discounted price is also 95
     * If the original price is 100, the discounted price is also 100
     * If the original price is 105, the discounted price is 95
     */
    
    /***** QUESTION 4
     * If the original price is 95, the discounted price is 85
     * If the original price is 100, the discounted price is 90
     * If the original price is 105, the discounted price is 85
     */
}