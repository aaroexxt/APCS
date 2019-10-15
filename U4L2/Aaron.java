enum Mood {
    HAPPY,
    ANNOYED,
    SLEEPY
}

public class Aaron {
    private Mood mood;
    private int happinessLevel;
    private double hoursSleep;
    
    public Aaron() {
        this.mood = Mood.ANNOYED;
        this.happinessLevel = 70;
        this.hoursSleep = 6.5;
    }
    
    public Aaron(Mood mood, int hL, double hS) {
        this.mood = mood;
        this.happinessLevel = hL;
        this.hoursSleep = hS;
    }
    
    public String toString() {
        String output = new String();
        output = "CurrentMood: "+this.mood+", happinessLevel: "+this.happinessLevel+", hoursSleep: "+this.hoursSleep;
        return output;
    }
}