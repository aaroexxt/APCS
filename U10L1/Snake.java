public class Snake extends Animal implements NonFlyer {
    public Snake(String name) {
        super(false, false);
    }
    public void eat() {
        System.out.println("rats");
    }
    public void hair() {
        System.out.println("none");
    }
    public void sound() {
        System.out.println("Hisses");
    }
    public void movement() {
        System.out.println("slithers");
    }
}