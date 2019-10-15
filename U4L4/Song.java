public class Song {
    private boolean favorite;
    private int plays;
    private int seconds;
    
    private int trackIndex;
    private String title;
    private int remixes;

    private int yearReleased;
    
    public Song() {
        favorite = true;
        plays = 10;
        seconds = 51;
        
        trackIndex = 2;
        title = "A Cool Song";
        remixes = 3;
        yearReleased = 2012;
    }
    
    public Song(boolean f, int p, int s, int t, String ti, int r, int yR) {
        this.favorite = f;
        this.plays = p;
        this.seconds = s;
        
        this.trackIndex = t;
        this.title = ti;
        this.remixes = r;
	   this.yearReleased = yR;
    }
	
    public int getYearReleased() {
	   return this.yearReleased;
    }

	public void setYearReleased(int nY) {
		this.yearReleased = nY;
	}

	public String getSongLength() {
		int mins = Math.floor(this.seconds%60);
		int secs = this.seconds-(mins*60);
		String output = new String();
		output+="The length of the song is: ";
		output+=mins+" minutes";
		output+=" and "+secs+" seconds."
	}
    
    public String toString() {
        String output = new String();
        output = "Favorite: "+this.favorite+"\nPlays: "+this.plays+"\nMinutes: "+this.minutes+"\nSeconds: "+this.seconds+"\ntrackIndex: "+this.trackIndex+"\nTitle: "+this.title+"\nRemixes: "+this.remixes;
        return output;
    }
}