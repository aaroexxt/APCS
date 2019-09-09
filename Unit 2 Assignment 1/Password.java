import java.util.Scanner;
public class Password {
    public static Scanner input;
    private static int[] password = new int[]{4,7,8,3};
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int[] inpPassword = promptPassword();
        System.out.println("The password is: "+((comparePassword(inpPassword)) ? "Correct" : "Incorrect"));
    }
    public static int[] promptPassword() {
         System.out.println("Enter a password: ");
         String inputPassword = input.nextLine();
         System.out.println("You entered: "+inputPassword);
         int[] intArray = new int[4];
         char[] charArray = inputPassword.toCharArray();
         for (int i=0; i<4; i++) {
             intArray[i] = (int)charArray[i];
         }
         return intArray;
    }
    public static boolean comparePassword(int[] ckPassword) {
        for (int i=0; i<4; i++) {
            if (!(ckPassword[i] == password[i])) {
                return false;
            }
        }
        return true;
    }
}