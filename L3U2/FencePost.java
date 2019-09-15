import java.util.Scanner;
public class FencePost {
    public static void main(String[] args) {
        System.out.println("Enter post count: ");
        int posts = new Scanner(System.in).nextInt();
        
        /**** REGULAR
        System.out.print("|");
        for (int i=1; i<posts; i++) {
            System.out.print("==|");
        }
        */
       
       int wire = 1;
       System.out.print("|");
       for (int i=1; i<posts; i++) {
           for (int j=0; j<wire; j++) {
               System.out.print("=");
            }
            System.out.print("|");
            wire++;
        }
    }
}