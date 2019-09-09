import java.util.Scanner;
public class DivBySix {
    public static void main(String args[]) {
        int sum = 0;
        for (int i=1; i<=60; i++) {
            if (i%6==0) {
                sum+=i;
                System.out.println(i+"\t"+sum);
            }
        }
    }
}