import java.util.ArrayList;
import java.util.Collections;

public class BankAccountSorting {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(9999.95);
        BankAccount ba2 = new BankAccount(89.95);
        BankAccount ba3 = new BankAccount(75.60);
        BankAccount ba4 = new BankAccount(50.5);
        BankAccount ba5 = new BankAccount(50.0);
        // Put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        list.add(ba4);
        list.add(ba5);
        // Call the library sort method
        Collections.sort(list);
        // Print out the sorted list
        for (int i = 0; i < list.size(); i++) {
            BankAccount b = list.get(i);
            System.out.println(b.getBalance());
        }
        
        /*
         * The changed output is that it sorts from greatest to least instead of least to greatest.
         */
    }
}