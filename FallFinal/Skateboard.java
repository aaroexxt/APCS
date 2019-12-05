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
    private SkateboardWheel[] wheels;
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
        wheels = new SkateboardWheel[4];
        for (int i=0; i<wheels.length; i++) {
            wheels[i] = new SkateboardWheel();
        }
        odometer = 0.0;
        //Add a default transaction - purchase from manufacturer
        transactions.clear();
        transactions.add(new Transaction());
    }
    public Skateboard(SkateboardType type, SkateboardDeck deck, SkateboardWheel wheels[]) {
        this.type = type;
        this.deck = deck;
        this.wheels = wheels;
        odometer = 0.0;
        //Add a default transaction - purchase from manufacturer
        transactions.clear();
        transactions.add(new Transaction());
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
    public SkateboardWheel[] getWheels() {
        return wheels;
    }
    //Essentially a "setter" method for both deck and wheel
    public void upgrade(SkateboardDeck newDeck, SkateboardWheel[] newWheels, int newCost) {
        //First, set the deck and wheels to the new objects
        deck = newDeck;
        wheels = newWheels;
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
    public String getCurrentOwner() {
        sortTransactions(); //sort to get updated owner - highest cost will be first
        //Now poll for last transaction
        Transaction lastTransaction = transactions.get(transactions.size()-1);
        //Aaaand return the newest owner
        return lastTransaction.getNewOwner();
    }
    /*
     * RIDE THE BOARD
     */
    double ride(boolean isRotations, double distanceOrRotations) {
        if (isRotations) {
            //Find average wheel diameter by adding and then dividing by total
            double avgDiameter = (double)wheels[0].getDiameter();
            int counter = 1;
            do {
                avgDiameter += wheels[counter].getDiameter();
                counter++;
            } while (counter < wheels.length);
            avgDiameter/=wheels.length;
            
            double circumference = Math.PI*avgDiameter;
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
     * USE
     */
    public String getUseCase() {
        String output = "";
        switch (type) {
            case STANDARD:
                output = "For use in parks and on the streets";
                break;
            case CRUISER:
                output = "For use on the streets and crusing around due to its long kicktail";
                break;
            case OLDSCHOOL:
                output = "For use in pools or ramps or carving";
                break;
            case LONGBOARD:
                output = "For use in transportation or carving";
                break;
        }
        return output;
    }
    /*
     * TOSTRING
     */
    public String toString() {
        String output = "SKATEBOARD\n-----------\n";
        output+="Type: "+type+"\n\n";
        //uses toString methods in deck and wheel
        output+="Deck:\n"+deck+"\n\n";
        output+="Wheels:\n";
        for (SkateboardWheel w : wheels) {
            output+=w+"\n";
        }
        output+="\n\n";
        output+="Odometer: "+odometer+"\n\n";
        output+="Transactions:\n";
        int counter = 0;
        while (counter < transactions.size()) {
            output+=transactions.get(counter)+"\n";
            counter++;
        }
        return output;
    }
}