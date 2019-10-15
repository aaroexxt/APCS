import java.util.Scanner;
public class Poem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What line?");
        int line = input.nextInt();
        
        switch(line) {
            case 1:
                System.out.println("One, two, buckle my shoe");
                break;
            case 2:
                System.out.println("Three, four, shut the door");
                break;
            case 3:
                System.out.println("Five, six, pick up sticks");
                break;
            case 4:
                System.out.println("Seven, eight, lay them straight");
                break;
            case 5:
                System.out.println("Nine, ten, a good fat hen");
                break;
            default:
                System.out.println("What line is that?");
                break;
        }
        
        /****** QUESTIONS
         *  (x == 0 && y == 0)
         * (x == 0 && y!=0) || (y == 0 && x!=0)
         * 
         * 
         */
    }
}