public class Part1 {
    public static void main(String[] args) {
        String[] movies = {"Bourne Identity", "Spongebob Squarepants", "The Emoji Movie"};
        String[] songs = {"USSR National Anthem", "SpongeBob Theme Song", "Thomas the Dank Engine"};
        
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