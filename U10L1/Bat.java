public class Bat extends Animal implements Flyer {
    public Bat(String name) {
        super(true, true);
    }
    public void eat() {
        System.out.println("fruit and insects");
    }
    public void hair() {
        System.out.println("fur");
    }
    public void takeoff() {
        System.out.println("launches from the tree");
    }
    public void land() {
        System.out.println("hangs on a rafter");
    }
}