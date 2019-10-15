public class CollegeApp {
    public static void main(String[] args) {
        String[] colleges = {"Cal","other UCs", "Cornell", "CalPoly", "GIT", "UIUC", "CMU"};
        
        int zeroLen = colleges[0].length();
        int shortestLength = zeroLen;
        int shortestLengthIndex = 0;
        int longestLength = zeroLen;
        int longestLengthIndex = 0;
        
        for (int i=1; i<colleges.length; i++) {
            int len = colleges[i].length();
            System.out.println("Index: "+i+", Length: "+len);
            
            if (len < shortestLength) {
                shortestLength = len;
                shortestLengthIndex = i;
            } else if (len > longestLength) {
                longestLength = len;
                longestLengthIndex = i;
            }
        }
        
        System.out.println("\nShortestLenUniv: "+colleges[shortestLengthIndex]+"\nLongestLenUniv: "+colleges[longestLengthIndex]+"\n");
        
        colleges[(int)(Math.random()*(colleges.length+1))] = null;
        System.out.println("All Schools: ");
        for (String c : colleges) {
            System.out.println(c);
        }
    }
}