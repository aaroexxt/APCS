import java.util.Scanner;
public class War {
    public static int[] computerDeck;
    public static int[] playerDeck;
    public static int playerWins;
    public static int computerWins;
    public static Scanner input;
    
    public static void main(String[] main) {
        input = new Scanner(System.in);
        playerWins = 0;
        computerWins = 0;
        playGame();
    }
    
    public static void playGame() {
        //Populate the arrays
        computerDeck = new int[10];
        playerDeck = new int[10];
        int playerRoundWins = 0;
        int computerRoundWins = 0;
        
        //Play the game
        for (int i=0; i<computerDeck.length; i++) {
            computerDeck[i] = (int)(Math.random()*21)+1;
        }
        for (int i=0; i<playerDeck.length; i++) {
            playerDeck[i] = (int)(Math.random()*21)+1;
        }
        
        for (int i=0; i<computerDeck.length; i++) {
            if (playerDeck[i] > computerDeck[i]) {
                playerRoundWins++;
                System.out.println("Player Wins Round");
            } else if (playerDeck[i] < computerDeck[i]) {
                computerRoundWins++;
                System.out.println("Computer Wins Round");
            } else {
                System.out.println("Tie");
            }
        }
        
        if (playerRoundWins > computerRoundWins) {
            System.out.println("Player Won");
            playerWins++;
        } else if (playerRoundWins < computerRoundWins) {
            System.out.println("Computer Won");
            computerWins++;
        } else {
            System.out.println("Game is a Tie");
        }
        
        System.out.println("------------\nComputer: "+computerWins+" wins\nPlayer: "+playerWins+" wins\n------------");
        
        System.out.println("Do you want to play again? (Y/N)");
        String yn = input.nextLine();
        if (yn.toLowerCase().equals("y")) {
            System.out.println("Playing again!");
            playGame();
        } else {
            System.out.println("Quitting");
        }
    }
}