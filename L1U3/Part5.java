import java.util.Scanner;
public class Part5 {
    public static void main(String[] args) {
        String[] prizes = {"Used Pencil", "Sad-looking Binder", "Paper with a F", "Paper with an A", "Broken Java Program", "Working Java Program"};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Which door do you want to pick?");
        int door = input.nextInt()-1;
        
        if (door < 0 || door > prizes.length-1) {
            System.out.println("That prize doesn't exist!");
        } else {
            String prize = prizes[door];
            System.out.println("You won a: "+prize);
            System.out.println("Now it's time for the SPINNING WHEEL OF PRIZE FREEDOM");
            if (door == (int)(Math.random()*(prizes.length-1))+1) {
                System.out.println("YOU WON NOTHING :(");
            } else {
                System.out.println("You get to keep your prize");
            }
        }
    }
}
