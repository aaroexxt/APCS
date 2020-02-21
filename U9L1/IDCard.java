public class IDCard extends Card {
    public String IDNumber;
    public IDCard(String n, String id) {
        super(n);
        IDNumber = id;
    }
    public String format() {
        return (super.format()+", IDNumber: "+IDNumber);
    }
}