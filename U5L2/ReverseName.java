import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        
        String[] split = name.split(",");
        for (int i=0; i<split.length; i++) {
            split[i] = split[i].trim();
        }
        
        //Level 1
        System.out.println("Level1:\n"+reverseString(split[1])+", "+reverseString(split[0]));
        //Level 2
        System.out.println("Level2:\n"+split[1]+", "+split[0]);
    }
    public static String reverseString(String str) {
        char[] charArr = str.toCharArray();
        char[] revCharArr = new char[charArr.length];
        int counter = charArr.length-1;
        for (int i=0; i<charArr.length; i++) {
            revCharArr[counter] = charArr[i];
            counter--;
        }
        return new String(revCharArr);
    }
}