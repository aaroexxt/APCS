import java.util.Scanner;
public class FunMath {
    public static Scanner input; //public instance of the Scanner class
    public static void main(String[] args) {
        /*****PART B*/
        //Setup the Scanner instance
        input = new Scanner(System.in);
        
        //Quiz the user for the input
        int int1 = quizUser("Enter a number.");
        int int2 = quizUser("Enter another number.");
        
        //Print everything, using Math.blank values (math library is builtin)
        System.out.println("Sum: "+(int1+int2)+"\nDifference: "+(int1-int2)+"\nProduct: "+(int1*int2)+"\nAverage: "+((double)(int1+int2)/2.0)+"\nDistance: "+Math.abs(int1-int2)+"\nMaximum: "+Math.max(int1,int2)+"\nMinimum: "+Math.min(int1,int2));
    }
    
    public static int quizUser(String question) {
        System.out.println(question); //ask the user the question
        return input.nextInt(); //use public instance to get next input
    }
}