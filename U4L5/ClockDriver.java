public class ClockDriver {
    public static void main(String[] args) {
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
		kitchenClock.setTime(10,20,15);
		System.out.println(kitchenClock);
		kitchenClock.convertDaylightSaving(1);
		System.out.println(kitchenClock);
        
        Clock bedroomClock = new Clock(22, 10, 15);
        System.out.println(bedroomClock);
    }
}