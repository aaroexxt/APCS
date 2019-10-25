public class Car {
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    
    public Car() {
        this.milesDriven = 0;
        this.gasInTank = 0;
        this.milesPerGallon = 50;
    }
    
    public Car(double mpg) {
        this.milesPerGallon = mpg;
        this.milesDriven = 0;
        this.gasInTank = 0;
    }
    
    public void drive(double distance) {
        this.milesDriven+=distance;
        double gasConsumed = distance/this.milesPerGallon;
        this.gasInTank-=gasConsumed;
        //return gasConsumed;
    }
    
    public void addGas(double amount) {
        this.gasInTank+=amount;
    }
    
    public double getGasInTank() {
        return this.gasInTank;
    }
}