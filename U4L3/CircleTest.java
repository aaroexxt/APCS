import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What size circle to make?");
        Circle circle = new Circle(in.nextDouble());
        
        System.out.println(circle); //uses toString method
    }
}