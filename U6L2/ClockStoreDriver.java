public class ClockStoreDriver {
    public static void main(String[] args) {
        //Create 3 new random clock objects
        Clock clock1 = new Clock(12, 30, 45);
        Clock clock2 = new Clock(5, 20, 50);
        Clock clock3 = new Clock(6, 30, 49);
        
        
        ClockStore storage = new ClockStore(clock1, clock2, clock3); //Populate using multiarg constructor
        
        System.out.println("Most seconds of clocks: "+storage.mostSeconds());
        System.out.println("ClockStorage toString: "+storage);
    }
}