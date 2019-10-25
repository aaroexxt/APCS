public class CarTester {
    public static void main(String args[]) {
        Car car = new Car();
        
        car.addGas(20);
        car.drive(100);
        double actualGas = car.getGasInTank();
        
        System.out.println("Actual gas level: "+actualGas+"\nExpected gas level: 23.0");
        //3:
        //Mutators - add gas, drive
        //Getters - getGasInTank
        
        Car mazda = new Car(35);
        
        mazda.addGas(20);
        mazda.drive(105);
        
        System.out.println("Actual gas level: "+mazda.getGasInTank());
        System.out.println("Expected: 22.0");
        
        //5: C
        //6: C
        
        //7: local variable
    }
}
