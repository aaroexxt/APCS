public class VendingMachineTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10);
        machine.insertToken();
        machine.insertToken();
        System.out.println("Token count: "+machine.getTokenCount());
        System.out.println("Expected: 2");
        System.out.println("Can count: "+machine.getCanCount());
        System.out.println("Expected: 8");
        
        VendingMachine machine2 = new VendingMachine(8);
        machine2.fillUp(2);
        System.out.println("Machine2 Can count: "+machine2.getCanCount());
    }
}