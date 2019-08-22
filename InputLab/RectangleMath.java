import java.util.Scanner;
public class RectangleMath {
    public static Scanner input;
    public static void main(String[] args) {
        /*****PART C*/
        //Setup scanner
        input = new Scanner(System.in);
        
        System.out.println("RectangleMath by Aaron Becker");
        int side1 = quizUser("Enter the long side of a rectangle.");
        int side2 = quizUser("Enter the short side of a rectangle.");
        
        double diagonalLength = Math.sqrt(Math.pow((double)side1,2)+Math.pow((double)side2,2)); //square each side first, then sqrt
        System.out.println("Area of triangle: "+(side1*side2)+"\nPerimeter of triangle: "+((2*side1)+(2*side2))+"\nDiagonal length: "+diagonalLength);
        
        /*****QUESTION & ANSWER / VOCAB CHECK
         * Q1) The first statement sequence is incorrect because it asks for 2 inputs, when the user is only prompted for 1.
         * Q2) The next statement sequence's problem is that the value is recorded into a double but the user is only prompted for an int type.
         * Vocab Check: Scanner, Strings, Objects, Classes, Method, Main Method, Package, Concatenate, Variable
         */
    }
    
    public static int quizUser(String question) {
        System.out.println(question);
        return input.nextInt();
    }
}