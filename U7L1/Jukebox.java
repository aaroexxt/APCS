public class Jukebox {
    private MySong songList[][] = new MySong[3][4];
    public Jukebox() {
        //Song name, rating
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );
    }
    public String toString() {
        String output = "";
        for (MySong[] outer : songList) {
            for (MySong inner : outer) {
                output+=inner+"\t";
            }
            output+="\n";
        }
        return output;
    }
    public MySong randomSong() {
        int randRow = (int)(Math.random()*songList.length);
        int randCol = (int)(Math.random()*songList[0].length);
        MySong randSong = songList[randRow][randCol];
        System.out.println("randomSong: "+randSong);
        return randSong;
    }
    public void playSongOfRating(int rating) {
        for (int i=0; i<songList.length; i++) {
            for (int j=0; j<songList[i].length; j++) {
                MySong song = songList[i][j];
                if (song.getRating() == rating) {
                    System.out.println(song);
                }
            }
        }
    }
}