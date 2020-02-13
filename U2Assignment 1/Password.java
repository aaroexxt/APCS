import java.util.Scanner;
public class Password {
    public static Scanner input;
    private static int[] password = new int[]{4,7,8,3};
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int[] inpPassword = promptPassword();
        System.out.println("The password is: "+((comparePassword(inpPassword)) ? "Correct" : "Incorrect (Wrong, try again!)"));
    }
    public static int[] promptPassword() {
         System.out.println("Enter a password: ");
         String inputPassword = input.nextLine();
         System.out.println("You entered: "+inputPassword);
         int[] intArray = new int[4];
         for (int i=0; i<4; i++) {
             intArray[i] = Integer.parseInt(inputPassword.substring(i,i+1));
         }
         return intArray;
    }
    public static boolean comparePassword(int[] ckPassword) {
        for (int i=0; i<4; i++) {
            if (ckPassword[i] != password[i]) {
                //System.out.println("chr nm: "+i+" "+ckPassword[i]+" "+password[i]);
                return false;
            }
        }
        return true;
    }
}