import java.util.Scanner;

public class QuadraticEquationDriver {
    public static void main(String[] args) {
        System.out.println("Input A, B, C");
        Scanner input = new Scanner(System.in);
        QuadraticEquation QE = new QuadraticEquation(input.nextInt(), input.nextInt(), input.nextInt());
        if (QE.getDiscriminant() < 0) {
            System.out.println("No real solutions");
        } else {
            System.out.println("Solution 1: "+QE.getSolution1());
            System.out.println("Solution 2: "+QE.getSolution2());
        }
    }
}