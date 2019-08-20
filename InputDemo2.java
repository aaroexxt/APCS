import java.util.Scanner;
import javax.swing.JOptionPane;
/*public class InputDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("How tall are you? ");
        double height = in.nextDouble();
        double newHeight = (height*1.1);
        System.out.println("\nNext year, you will be "+newHeight+" inches tall.");
        System.out.print("What is your GPA? ");
        double GPA = in.nextDouble();
        double newGPA = (GPA*1.05);
        System.out.println("\nI hope next year you'll keep your GPA above "+newGPA);
        System.out.println("\n\nMy goal for next year is "+newHeight+"in tall and keep my GPA above "+newGPA+"!");
    }
}*/
public class InputDemo2 {
    public static void main(String[] args) {
        Object[] possibleValues = {"Good", "OK", "Not Great"};
        
        Object feeling = JOptionPane.showInputDialog(null, "Please enter how you're feeling: ", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
        boolean accepted = (JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Choose one", JOptionPane.YES_NO_OPTION) == 1);
        if (!accepted) {
            System.out.println("The survey reports that you're feeling "+feeling+" today. Thank you.");
        }
    }
}