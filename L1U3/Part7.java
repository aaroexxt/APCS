import java.util.Scanner;
public class Part7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        if (username == "Aaron" && password == "openSesame") {
            System.out.println("You have successfuly logged in");
        } else {
            System.out.println("Login unsuccessful");
        }
    }
}