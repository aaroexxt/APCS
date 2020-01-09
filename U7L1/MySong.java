public class MySong {
    private String name;
    private int rating;
    public MySong(String n, int r) {
        name = n;
        rating = r;
    }
    public String toString() {
        return "Song name: "+name+", rating: "+rating;
    }
    public int getRating() {
        return rating;
    }
}