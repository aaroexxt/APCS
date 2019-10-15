public class AaronDriver {
    public static void main(String[] args) {
        Aaron AaronThisMorning = new Aaron(Mood.SLEEPY, 50, 6.2);
        System.out.println(AaronThisMorning);
        
        Aaron AaronAtSchool = new Aaron();
        System.out.println(AaronAtSchool);
    }
}