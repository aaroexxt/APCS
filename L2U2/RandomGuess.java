import java.util.Scanner;
public class RandomGuess {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int randInt = (int)(Math.random()*20)+1;
        boolean success = false;
        for (int i=0; i<5; i++) {
            int userGuess = askUser();
            if (userGuess == randInt) {
                System.out.println("Success!");
                success = true;
                break;
            } else if (userGuess < randInt) {
                System.out.println("Guess higher");
            } else {
                System.out.println("Guess lower");
            }
        }
        if (!success) {
            System.out.println("You failed :(\nThe number was "+randInt);
        }
    }
    public static int askUser() {
        System.out.println("Guess a number:");
        return input.nextInt();
    }
}