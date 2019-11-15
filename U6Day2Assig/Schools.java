import java.io.*;
import java.util.*;
public class Schools {
    public static void main(String[] args) {
        ArrayList<String> schools = new ArrayList<String>();
        
        schools.add("UCLA");
        schools.add("UCSD");
        schools.add("UCSC");
        schools.add("UCSB");
        schools.add("Harvard");
        schools.add("Johns Hopkins");
        schools.add("Carnegie Mellon");
        schools.add("Stanford");
        schools.add("MITT");
        schools.add("Cornell");
        
        System.out.println("Length: "+schools.size());
        
        System.out.println("Before removing 4 letters");
        for (String school : schools) {
            System.out.println(school);
        }
        
        for (int i=schools.size()-1; i>=0; i--) {
            if (schools.get(i).length() == 4) {
                schools.remove(i);
            }
        }
        
        System.out.println("New length: "+schools.size());
        System.out.println("After removing 4 letters");
        for (String school : schools) {
            System.out.println(school);
        }
    }
}