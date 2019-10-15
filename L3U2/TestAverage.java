import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("# of tests");
        int tests = input.nextInt();
        int sum = 0;
        
        //PART A
        do {
            System.out.println("Enter test score:");
            sum+=input.nextInt();