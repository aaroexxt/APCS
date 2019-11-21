import java.util.*;
import java.io.*;
public class MyDoors {
    private Doors[] doorsHave;
    private ArrayList<Doors> doorsNeed;
    
    public MyDoors() {
        doorsHave = new Doors[3];
        doorsHave[0] = new Doors("Front",true);
        doorsHave[1] = new Doors("Back",false);
        doorsHave[2] = new Doors("Side",true);
        
        doorsNeed = new ArrayList<Doors>();
        doorsNeed.add(new Doors("Sliding",false));
        doorsNeed.add(new Doors("Doggie", true));
        doorsNeed.add(new Doors("Garage", false));
    }
    
    public String toString() {
        String output = new String();
        output+="DoorsHave:\n";
        for (Doors d : doorsHave) {
            output += d.toString()+"\n";
        }
        output+="DoorsNeed:\n";
        for (Doors d : doorsNeed) {
            output += d.toString()+"\n";
        }
        return output;
    }
    
    public int tornadoComing() {
        int doorsChanged = 0;
        for (int i=0; i<doorsHave.length; i++) {
            if (doorsHave[i].getState() == false) {
                doorsHave[i].open();
                doorsChanged++;
            }
        }
        for (int i=0; i<doorsNeed.size(); i++) {
            if (doorsNeed.get(i).getState() == false) {
                doorsNeed.remove(i);
                doorsChanged++;
            }
        }
        return doorsChanged;
    }
}
    