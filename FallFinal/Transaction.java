import java.time.*;
import java.util.*;
import java.io.*;

public class Transaction {
    private LocalDate transactionDate;
    private String prevOwner;
    private String newOwner;
    private int cost; //$$$ usd
    boolean accepted;
    
    public Transaction() {
        int randMonth = (int)(Math.random()*12+1); //Select a random month 1-12
        int randDay = (int)(((randMonth == 2) ? Math.random()*28 : (randMonth % 2 == 1) ? Math.random()*31 : Math.random()*30)+1); //Ensure we have a valid number of days
        transactionDate = LocalDate.of(2019, randMonth, randDay);
        prevOwner = "Manufacturer";
        newOwner = "Aaron Becker";
        cost = 200;
        accepted = true;
    }
    public Transaction(Transaction lastTransaction, LocalDate transactionDate, String newOwner, int cost) {
        if (cost > lastTransaction.cost) { //Interpret whether the deal will be accepted as long as it gets a higher cost
            accepted = true;
        } else {
            accepted = false;
        }
        this.prevOwner = lastTransaction.newOwner; //Take old owner and exchange with lastOwner
        this.newOwner = newOwner;
        this.cost = cost;
        this.transactionDate = transactionDate;
    }
    
    /*
     * GETTERS/SETTERS
     */
    public int getCost() {
        return cost;
    }
    public void setCost(int newCost) {
        cost = newCost;
    }
    public boolean getAccepted() {
        return accepted;
    }
    public String getNewOwner() {
        return newOwner;
    }
    public String getPrevOwner() {
        return prevOwner;
    }
    /*
     * 'COMPARE TO' FOR SORTING
     */
    public static Comparator<Transaction> costComparator = new Comparator<Transaction>() {
        public int compare(Transaction t1, Transaction t2) {
            int t1C = t1.getCost();
            int t2C = t2.getCost();
            return (t1C < t2C) ? -1 : (t1C == t2C) ? 0 : 1;
        }
    };
    /*
     * TOSTRING
     */
    public String toString() {
        String output = "";
        output+="Accepted: "+accepted;
        output+=", Cost: "+cost;
        output+=", PrevOwner: "+prevOwner;
        output+=", NewOwner: "+newOwner;
        output+=", transactionDate: "+transactionDate;
        return output;
    }
}