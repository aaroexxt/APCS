import java.io.*;
import java.util.*;

public class ClockStore {
    private ArrayList<Clock> clocksInStock = new ArrayList<Clock>();
    
    public ClockStore() {
        for (int i=0; i<3; i++) {
            clocksInStock.add(new Clock());
        }
    }
    
    public ClockStore(Clock clock1, Clock clock2, Clock clock3) {
        clocksInStock.add(clock1); //add to lost
        clocksInStock.add(clock2);
        clocksInStock.add(clock3);
    }
    
    public int mostSeconds() {
        int maxSeconds = clocksInStock.get(0).totalSeconds();
        for (int i=1; i<clocksInStock.size(); i++) { //loop thru all clocks starting from 1
            int elemSeconds = clocksInStock.get(i).totalSeconds(); //total seconds of clock element i
            if (elemSeconds > maxSeconds) {
                maxSeconds = elemSeconds;
            }
        }
        return maxSeconds;
    }
    
    public String toString() {
        String output = "";
        for (int i=0; i<clocksInStock.size(); i++) {
            output+="Clock at Index: "+i+"\nTime: "+clocksInStock.get(i)+"\n";
        }
        return output;
    }
    
}