public class MyDoorsDriver {
    public static void main(String[] args) {
        MyDoors doorTracker = new MyDoors();
        System.out.println("Original doorTracker:\n"+doorTracker);
        System.out.println("Doors opened/removed: "+doorTracker.tornadoComing());
        System.out.println("doorTracker after tornado:\n"+doorTracker);
    }
}