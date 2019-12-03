import java.util.*;

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
    public void upgrade(SkateboardDeck newDeck, SkateboardWheel newWheel, int newCost) {
        //First, set the deck and wheels to the new objects
        deck = newDeck;
        wheel = newWheel;
        //Next, update the cost for the latest transaction
        //this.sortTransactions(); //first, sort transactions
        transactions.get(transactions.size()-1).setCost(newCost); //Set cost
    }
    
}