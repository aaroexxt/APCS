import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] movies = new String[3];
        String[] songs = new String[3];
        System.out.println("Enter movies: ");
        for (int i=0; i<movies.length; i++) {
            movies[i] = input.nextLine();
        }
        System.out.println("Enter songs: ");
        for (int i=0; i<songs.length; i++) {
            songs[i] = input.nextLine();
        }
        
        for (int i=0; i<movies.length; i++) {
            System.out.println(movies[i]);
        }
        System.out.println("\n");
        int count = 0;
        while (count < songs.length) {
            System.out.print(songs[count]+((count!=songs.length-1)?", ":""));
            count++;
        }
    }
}
