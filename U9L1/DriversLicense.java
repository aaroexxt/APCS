public class DriversLicense extends IDCard {
    private String expirationYear;
    public DriversLicense(String name, String id, String expirationYear) {
        super(name, id);
        this.expirationYear = expirationYear;
    }
    public String getExpirationYear() {
        return expirationYear;
    }
    public String format() {
        return super.format()+", expirationYear: "+expirationYear;
    }
}