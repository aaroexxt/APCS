import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        char[] strArr = str.toCharArray();
        char[] realStringArr = new char[strArr.length];
        char[] revStringArr = new char[strArr.length];
        int counterFwd = 0;
        int counterRev = strArr.length-1;
        
        for (int i=0; i<strArr.length; i++) {  //use ascii table definition           
            if ((int)strArr[i] >= 97 && (int)strArr[i] <= 122) {
                realStringArr[counterFwd] = strArr[i];
                revStringArr[counterRev] = strArr[i];
                counterFwd++;
                counterRev--;
            }
        }
        
        String parsedFwd = new String(realStringArr).trim();
        String parsedRev = new String(revStringArr).trim();
        
        System.out.println("ParsedFWD: "+parsedFwd+"\nParsedREV: "+parsedRev);
        if (parsedFwd.equals(parsedRev)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}