import java.time.*;
import java.util.*;
public class SkateboardDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * ZERO ARG CONSTRUCTOR DEMO
         */
        //First, create a default board to demonstrate zero-arg constructors
        Skateboard defaultBoard = new Skateboard();
        System.out.println("Default Board:\n"+defaultBoard);
        System.out.println("Board use case: "+defaultBoard.getUseCase());
        
        /*
         * MULTI ARG CONSTRUCTOR DEMO
         */
        //Create basic components of the board to pass in
        SkateboardWheel basicWheel = new SkateboardWheel(80, 70, "BasicWheels Co");
        SkateboardWheel allBasicWheels[] = {basicWheel, basicWheel, basicWheel, basicWheel};
        
        SkateboardDeck basicDeck = new SkateboardDeck(30, 7, false, "BasicDeck Co");
        //Create a new skateboard using multi-arg constructor
        Skateboard aaronsBoard = new Skateboard(SkateboardType.CRUISER, basicDeck, allBasicWheels);
        System.out.println("AaronsBoard Before Upgrade:\n"+aaronsBoard);
        System.out.println("Board use case: "+defaultBoard.getUseCase());
        
        /*
         * UPGRADED BOARD DEMO
         */
        //Prompt user using Scanner
        System.out.println("Please input new cost of upgraded board:");
        int cost = in.nextInt();
        //Create upgraded components of the board and upgrade
        SkateboardWheel customWheel = new SkateboardWheel(100, 80, "AaronsWheels Co");
        SkateboardWheel allCustomWheels[] = {customWheel, customWheel, customWheel, customWheel}; //Create array of wheels
        
        SkateboardDeck customDeck = new SkateboardDeck(32, 8, false, "AaronsDeck Co");
        //Now, upgrade the skateboard
        SkateboardDeck upgradedDeck = new SkateboardDeck(36, 9, true, "AaronsBetterDeck Co");
        aaronsBoard.upgrade(upgradedDeck, aaronsBoard.getWheels(), cost);
        System.out.println("AaronsBoard After Upgrade:\n"+aaronsBoard);
        
        /*
         * BOARD TRANSACTIONS DEMO
         */
        LocalDate sellDate = LocalDate.of(2019, 12, 3);
        //Grayson's lowball offer :(
        boolean lowBallOffer = aaronsBoard.sell(400, "Grant", sellDate);
        boolean goodOffer = aaronsBoard.sell(700, "Grayson", sellDate);
        System.out.println("Did the lowball offer sell? "+lowBallOffer);
        System.out.println("Did the actual offer sell? "+goodOffer);
        
        //Demonstrate treelike nature of how sell algorithm works; previous owner will update correctly given new deals
        boolean secondOffer = aaronsBoard.sell(600, "Hubert", sellDate);
        boolean thirdOffer = aaronsBoard.sell(1000, "Ms. Wade", sellDate);
        System.out.println("Did Hubert's offer sell? "+lowBallOffer);
        System.out.println("Did Ms. Wade's offer sell? "+goodOffer);
        //At this point, we have a traceable history present in aaronsBoard 'transactions' instance variable. It'll be printed in AaronsBoard
        
        System.out.println("AaronsBoard after sale:\n"+aaronsBoard);
        System.out.println("Newest owner of AaronsBoard: "+aaronsBoard.getCurrentOwner());
    }
}