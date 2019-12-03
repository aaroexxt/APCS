import java.util.*;
import java.time.*;

enum SkateboardType {
    STANDARD,
    CRUISER,
    OLDSCHOOL,
    LONGBOARD
}

public class Skateboard {
    //Type of skateboard
    private SkateboardType type;
    //Components of skateboard
    private SkateboardDeck deck;
    private SkateboardWheel wheel;
    //Odometer - how far have we travelled
    double odometer;
    //List of transactions for this board
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    /*
     * CONSTRUCTORS
     */
    public Skateboard() {
        //Use default constructors
        type = SkateboardType.STANDARD;
        deck = new SkateboardDeck();
        wheel = new SkateboardWheel();
        odometer = 0;
        //Add a default transaction - purchase from manufacturer
        transactions.add(new Transaction());
    }
    public Skateboard(SkateboardType type, SkateboardDeck deck, SkateboardWheel wheel) {
        this.type = type;
        this.deck = deck;
        this.wheel = wheel;
        //Add a default transaction - purchase from manufacturer
    }
    /*
     * GETTER/SETTER METHODS
     */
    public SkateboardType getType() {
        return type;
    }
    //No type setter method - basic type should not be changed.
    public SkateboardDeck getDeck() {
        return deck;
    }
    public SkateboardWheel getWheel() {
        return wheel;
    }
    //Essentially a "setter" method for both deck and wheel
    public void upgrade(SkateboardDeck newDeck, SkateboardWheel newWheel, int newCost) {
        //First, set the deck and wheels to the new objects
        deck = newDeck;
        wheel = newWheel;
        //Next, update the cost for the latest transaction
        sortTransactions(); //first, sort transactions
        transactions.get(transactions.size()-1).setCost(newCost); //Set cost
    }
    /*
     * PURCHASING/TRANSACTIONS
     */
    public void clearPurchaseHistory() {
        transactions.clear();
        //Add a default transaction - purchase from manufacturer
        transactions.add(new Transaction());
    }
    //Getter for purchases
    public ArrayList<Transaction> getPurchaseHistory() {
        return transactions;
    }
    public boolean sell(int cost, String newOwner, LocalDate transactionDate) {
        sortTransactions(); //first, sort transactions by date
        //Next, get the last transaction for reference - should be last in the list after sorting
        Transaction lastTransaction = transactions.get(transactions.size()-1);
        //Then, create a new transaction with the old transaction
        Transaction newTransaction = new Transaction(lastTransaction, transactionDate, newOwner, cost);
        transactions.add(newTransaction);
        boolean accepted = newTransaction.getAccepted();
        return accepted; //Return whether the transaction was accepted
    }
    public void sortTransactions() {
        Collections.sort(transactions, Transaction.costComparator); //Uses the Collections helper to sort the objects using Transaction's custom compareTo function
    }
    /*
     * RIDE THE BOARD
     */
    double ride(boolean isRotations, double distanceOrRotations) {
        if (isRotations) {
            int diameter = wheel.getDiameter();
            double circumference = Math.PI*(double)diameter;
            odometer+=circumference*distanceOrRotations;
        } else {
            odometer+=distanceOrRotations;
        }
        return odometer;
    }
    double ride(int pumps, double pumpLength) {
        odometer+=((double)pumps*pumpLength);
        return odometer;
    }
    /*
     * TOSTRING
     */
    public String toString() {
        String output = "SKATEBOARD\n-----------\n";
        output+="Type: "+type+"\n\n";
        //uses toString methods in deck and wheel
        output+="Deck:\n"+deck+"\n\n";
        output+="Wheel:\n"+wheel+"\n\n";
        output+="Odometer: "+odometer+"\n\n";
        output+="Transactions:\n";
        for (Transaction t : transactions) {
            output+=t+"\n";
        }
        return output;
    }
}