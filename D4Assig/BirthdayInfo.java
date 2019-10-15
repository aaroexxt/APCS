import java.util.Scanner;
public class BirthdayInfo {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        int month = promptUser("What month were you born in?");
        int day = promptUser("What day were you born on?");
        
        int quarter;
        switch (month) {
            case 1:case 2:case 3: //q1
                quarter = 1;
                break;
            case 4:case 5:case 6: //q2
                quarter = 2;
                break;
            case 7:case 8:case 9: //q3
                quarter = 3;
                break;
            default: //anything else; q4
                quarter = 4;
                break;
        }
        
        /******* QUESTIONS
         * 2) Breaks are used to exit a particular case in a switch statement. If you forget one, the code will continue executing into the next case.
         * 3) No, the same case cannot have 2 breaks unless there is an additional condition inside the case. However by default, then it won't be possible
         * 
         * 
         */
        
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