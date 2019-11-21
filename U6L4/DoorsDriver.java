public class DoorsDriver {
    public static void main(String[] args) {
        Doors frontDoor = new Doors("front",false);
        Doors backDoor = new Doors("back",true);
        Doors sideDoor = new Doors("side",false);
        
        System.out.println(frontDoor);
        System.out.println(backDoor);
        System.out.println(sideDoor);
    }
}