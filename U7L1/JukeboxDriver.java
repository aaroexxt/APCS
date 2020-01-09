public class JukeboxDriver {
    public static void main(String[] args) {
        Jukebox j = new Jukebox();
        System.out.println(j);
        System.out.println(j.randomSong());
        j.playSongOfRating(4);
    }
}