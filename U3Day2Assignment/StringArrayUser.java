import java.util.Scanner;
public class StringArrayUser {
    public static void main(String[] args) {
        String[] mySongs = new String[3];
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < mySongs.length; index++) {
            System.out.println("Enter a cool song: ");
            mySongs[index] = input.nextLine();
        }
        for (int index = 0; index < mySongs.length; index++) {
            System.out.println(mySongs[index] + " ");
        }
        System.out.println("Array Length: ");
        System.out.println(mySongs.length);
    }
}