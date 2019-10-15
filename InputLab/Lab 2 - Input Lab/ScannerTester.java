import java.util.Scanner;

public class ScannerTester
{
    public static Scanner input; //make the input variable public (so it can be accessed by helper functions)
    public static void main(String[] args)
    {   
        /*****PART A, SCANNER VERSION*/
        input = new Scanner(System.in); //make input variable an instance of Scanner
        
        String name = quizUserString("Enter your full name (First and last).");
        String firstName = name.split(" ")[0]; //split name into first and last (by space)
        String lastName = name.split(" ")[1];
        
        //Keep quizzing the user for input
        String favFood = quizUserString("What's your favorite food?");
        String favColor = quizUserString("What's your favorite color?");
        String favMovie = quizUserString("What's your favorite  movie?");
        String favIC = quizUserString("What's your favorite Ice Cream flavor?");
        String favMusic = quizUserString("What's your favorite musical group?");
        
        //Start printing the user data in a controlled format
        System.out.println("Your first name is: "+firstName+", and your last name is: "+lastName);
        System.out.println("Favorite food: "+favFood+"\nFavorite color: "+favColor+"\nFavorite movie: "+favMovie+"\nFavorite ice cream flavor: "+favIC+"\nFavorite musical group: "+favMusic+"\n\nThank you for your input!");
    }
    
    //Two helper functions to reduce the amount of code in asking questions
    public static String quizUserString(String question) {
        System.out.println(question); //Ask the user the question
        return input.nextLine(); //return the next string that the user inputs
    }
    
    public static int quizUserInt(String question) {
        System.out.println(question);
        return input.nextInt();
    }
} 
