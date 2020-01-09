import java.util.Scanner;
public class CustomerLister {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] customerNames = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
        double[] customerBalance = new double[5];
        
        for (int i=0; i<customerNames.length; i++) {
            System.out.println("Enter balance for "+customerNames[i]);
            customerBalance[i] = in.nextDouble();
        }
        /* //Enhanced name printer
        for (String s : customerNames) {
            System.out.println(s);
        }*/
        for (int i=0; i<customerNames.length; i++) {
            System.out.println("Customer: "+customerNames[i]+", Balance: $"+customerBalance[i]);
        }
    }
}
        
        