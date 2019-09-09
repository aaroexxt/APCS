import java.util.Scanner;
public class Divisible {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        /*******
         * PART A
        int num = promptUser("Enter a number");
        
        boolean divisible5 = (num%5 == 0); //determine what num is divisible by
        boolean divisible3 = (num%3 == 0);
        
        if (divisible5 && divisible3) { //Then use the divisible statements to format print statements
            System.out.println(num+" is divisible by both 5 and 3.");
        } else if (divisible5) {
            System.out.println(num+" is divisible by 5");
        } else if (divisible3) {
            System.out.println(num+" is divisible by 3.");
        } else {
            System.out.println(num+" is not divisible by either 3 or 5.");
        }*/
        
        int a = promptUser("Enter number A");
        int b = promptUser("Enter number B");
        
        int num = promptUser("Input a max number");
        
        //Arrays for single multiples
        int aMultiples[] = new int[num];
        int bMultiples[] = new int[num];
        int commonMultiples[] = new int[num];
        
        //Create arrays of single multiples
        for (int i=0; i<num; i++) {  
            if (i%a == 0) {
                aMultiples[aMultiples.length-1] = i;
                System.out.println("aMultiple: "+i);
            }
            if (i%b ==0) {
                bMultiples[bMultiples.length-1] = i;
                System.out.println("bMultiple: "+i);
            }
        }
        
        //Bruteforce common multiples
        for (int i=1; i<num-1; i++) {
            if (arrayContains(aMultiples, i) && arrayContains(bMultiples, i)) { //check whether both are 1 - means that they are common
                commonMultiples[commonMultiples.length-1] = i; //set to i because that's what the multiple is
                System.out.println("cMultiple: "+i);
            }
        }
        
        //Generate final tally
        int multipleCount = 0;
        for (int i=0; i<num; i++) {
            if (arrayContains(aMultiples, i) && arrayContains(bMultiples, i) && !arrayContains(commonMultiples, i)) {
                multipleCount++;
            }
        }
        
        System.out.println("MultipleCount: "+multipleCount);

    }
    public static int promptUser(String question) {
        System.out.println(question);
        return input.nextInt();
    }
    public static boolean arrayContains(int[] array, int number) {
        for (int z=0; z<array.length; z++) {
            if (array[z] == number) {
                System.out.println(array[z]+" "+number);
                return true;
            }
        }
        return false;
    }
}