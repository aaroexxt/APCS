import java.time.*;

public class SkateboardDriver {
    public static void main(String[] args) {
        /*
         * ZERO ARG CONSTRUCTOR DEMO
         */
        //First, create a default board to demonstrate zero-arg constructors
        Skateboard defaultBoard = new Skateboard();
        System.out.println("Default Board:\n"+defaultBoard);
        
        /*
         * MULTI ARG CONSTRUCTOR DEMO
         */
        //Create upgraded components of the board and upgrade
        SkateboardWheel customWheels = new SkateboardWheel(100, 80, "AaronsWheels Co");
        SkateboardDeck customDeck = new SkateboardDeck(32, 8, false, "AaronsDeck Co");
        //Now, create a new skateboard using multi-arg constructor
        Skateboard aaronsBoard = new Skateboard(SkateboardType.CRUISER, customDeck, customWheels);
        System.out.println("AaronsBoard Before Upgrade:\n"+aaronsBoard);
        
        /*
         * UPGRADED BOARD DEMO
         */
        //Now, upgrade the skateboard
        SkateboardDeck upgradedDeck = new SkateboardDeck(36, 9, true, "AaronsBetterDeck Co");
        aaronsBoard.upgrade(upgradedDeck, aaronsBoard.getWheel(), 500);
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