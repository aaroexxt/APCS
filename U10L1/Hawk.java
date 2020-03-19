public class Hawk extends Animal implements Flyer {
    public Hawk(String name) {
        super(true, true);
    }
    public void eat() {
        System.out.println("small animals");
    }
    public void hair() {
        System.out.println("feathers");
    }
    public void sound() {
        System.out.println("Screeches");
    }
    public void takeoff() {
        System.out.println("glides");
    }
    public void land() {
        System.out.println("perches on a tree top");
    }
}