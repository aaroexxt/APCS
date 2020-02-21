public class CallingCard extends Card {
    private String cardNumber;
    private String PIN;
    public CallingCard(String name, String cardNumber, String PIN) {
        super(name);
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }
    public String getNumber() {
        return cardNumber;
    }
    public String getPIN() {
        return PIN;
    }
    public String format() {
        return super.format()+", cardNumber: "+cardNumber+", PIN: "+PIN;
    }
}