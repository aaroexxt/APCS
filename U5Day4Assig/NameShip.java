import java.util.Scanner;
public class NameShip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = in.nextLine();
        System.out.print("Enter your crush's first name: ");
        String cFirst = in.nextLine();
        
        System.out.println("Initials: "+first.substring(0,1)+"&"+cFirst.substring(0,1));
        System.out.println("Ship: "+first.substring(0,3)+cFirst.substring(cFirst.length()/2));
    }
}