public class Time {
    private int hour;
    private int minute;
    public Time(int h, int m) {
        hour = h;
        minute = m;
    }
    public String toString() {
        String output = "";
        output+=hour;
        output+=":";
        output+=minute;
        return output;
    }
}