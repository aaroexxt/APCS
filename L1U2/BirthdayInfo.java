import java.util.Scanner;
public class BirthdayInfo {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        int month = promptUser("What month were you born in?");
        int day = promptUser("What day were you born on?");
        
        int quarter;
        if (month >= 1 && month < 4) { //if statement to determine quarter
            quarter = 1; //q1
        } else if (month >= 4 && month < 7) {
            quarter = 2; //q2
        } else if (month >= 7 && month < 10) {
            quarter = 3; //q3
        } else {
            quarter = 4; //q4
        }
        
        int taxDay = 0; //taxDay is 0 for on tax day, 1 for before, 2 for after
        if (month > 4) {
            taxDay = 2;
        } else if (month < 4) {
            taxDay = 1;
        } else {
            taxDay = (day>15) ? 2 : (day == 15) ? 0 : 1; //use ternary operator to simplify if statement
        }
        
        System.out.println("Your birthday is in quarter "+quarter);
        System.out.println("Your birthday is "+((taxDay == 0) ? "on" : (taxDay == 1) ? "before" : "after")+" tax day.");
    }
    public static int promptUser(String question) {
        System.out.println(question);
        return input.nextInt();
    }
}