public class Monkey extends Animal implements NonFlyer {
    public Monkey(String name) {
        super(true, false);
    }
    public void eat() {
        System.out.println("fruit");
    }
    public void hair() {
        System.out.println("fur");
    }
    public void sound() {
        System.out.println("Chatters");
    }
    public void movement() {
        System.out.println("jumps");
    }
}