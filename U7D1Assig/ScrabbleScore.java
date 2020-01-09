import java.util.Scanner;
public class ScrabbleScore {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstupwxyz";
        int scores[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.nextLine();
        word = word.toLowerCase();
        int score = 0;
        
        for (int i=0; i<word.length(); i++) {
            int index = alphabet.indexOf(word.charAt(i));
            if (index > 0) {
                score += scores[index]; //uses alphabetized lookup table
            } else {
                System.out.println("Char at index: " +i+" is not valid");
            }
        }
        
        System.out.println("Word score: "+score);
    }
}