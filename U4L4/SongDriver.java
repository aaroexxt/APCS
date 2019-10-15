public class SongDriver {
    public static void main(String[] args) {
        Song song1 = new Song();
        System.out.println("Song1: "+song1);
		System.out.println("Song1 yearReleased: "+song1.getYearReleased());
		System.out.println("Song1 length: "+song1.getSongLength());
        
        Song song2 = new Song(true, 10, 610, 2, "Class Design Music: An Orchestral Trilogy", 1, 2000); //long song that's been played 10 times
		Song2.setYearReleased(2021); //rerelease in 2021
        System.out.println("Song2: "+song2);
		System.out.println("Song2 yearReleased: "+song2.getYearReleased());
    }
}
