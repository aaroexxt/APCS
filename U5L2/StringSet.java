import java.util.Arrays;
import java.util.Comparator;
public class StringSet {
    private String[] ordered = new String[3];
    public StringSet(String str1, String str2, String str3) {
        this.ordered[0] = str1;
        this.ordered[1] = str2;
        this.ordered[2] = str3;
        
        Comparator<String> lengthComparator = new Comparator<String>() {   
            public int compare(String o1, String o2) {
        	return Integer.compare(o1.length(), o2.length());
            }
        };
 
        Arrays.sort(ordered, lengthComparator);
    }


    public String getSmallest() {
        return this.ordered[0];
    }
    public String getMiddle() {
        return this.ordered[1];
    }
    public String getLargest() {
        return this.ordered[2];
    }
}