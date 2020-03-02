import java.util.ArrayList;
public class TelevisionDriver {
    public static void main(String[] args) {
        Plasma plasmaTV = new Plasma();
        LED ledTV = new LED();
        LCD lcdTV = new LCD();
        DLP dlpTV = new DLP();
        
        ArrayList<Television> televisionList = new ArrayList<Television>();
        televisionList.add(plasmaTV);
        televisionList.add(ledTV);
        televisionList.add(lcdTV);
        televisionList.add(dlpTV);
        
        System.out.println("Televisions: ");
        for(Television tv : televisionList) {
            System.out.println( tv );  
        }
    }
}