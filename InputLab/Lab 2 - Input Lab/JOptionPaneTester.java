import javax.swing.JOptionPane;

public class JOptionPaneTester
{

    public static void main(String[] args)
    {
        /***** PART A, JOPTIONPANE VERSION*/
        String name = JOptionPane.showInputDialog(null, "Enter your full name (First and last).");
        String firstName = name.split(" ")[0]; //split name into first and last (by space)
        String lastName = name.split(" ")[1];
        
        //Keep quizzing the user for input
        String favFood = JOptionPane.showInputDialog(null, "What's your favorite food?");
        String favColor = JOptionPane.showInputDialog(null, "What's your favorite color?");
        String favMovie = JOptionPane.showInputDialog(null, "What's your favorite  movie?");
        String favIC = JOptionPane.showInputDialog(null, "What's your favorite Ice Cream flavor?");
        String favMusic = JOptionPane.showInputDialog(null, "What's your favorite musical group?");
        
        //Start printing the user data in a controlled format
        System.out.println("Your first name is: "+firstName+", and your last name is: "+lastName);
        System.out.println("Favorite food: "+favFood+"\nFavorite color: "+favColor+"\nFavorite movie: "+favMovie+"\nFavorite ice cream flavor: "+favIC+"\nFavorite musical group: "+favMusic+"\n\nThank you for your input!");
    }
}
