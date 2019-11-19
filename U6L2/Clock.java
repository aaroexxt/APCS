public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock() {
        hours = 15;
        minutes = 16;
        seconds = 12;
    }
    
    public Clock(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

	public void setTime(int h, int m, int s) {
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}

	public void convertDaylightSaving(int hours) {
		this.hours+=hours;
	}

	public int totalSeconds() {
		return this.hours*3600+this.minutes*60+this.seconds;
	}
    
    public String toString() {
        String output = new String();
        output = "The 24-hour time is "+hours+":"+minutes+":"+seconds;
        boolean amPM = false; //false - am, true - pm
        if (hours > 12) {
            amPM = true;
            hours-=12;
        }
        output+="\nFYI, the 12-hour time is: "+hours+":"+minutes+":"+seconds+" "+(amPM?"PM":"AM");
		output+="\nTotal seconds: "+this.totalSeconds();
        return output;
    }
}