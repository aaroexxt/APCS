public class AnimalTest {
    public static void main(String[] args) {
        Snake s = new Snake("cobra");
        Bat b = new Bat("fox");
        Hawk h = new Hawk("redtail");
        Monkey m = new Monkey("spider");
        Animal z = new Hawk("testHawk");
        NonFlyer f = new Monkey("mankey");
        s.movement();
        System.out.println("Snakes have legs? "+s.legs+" Snakes have wings? "+s.wings);
        b.takeoff();
        z.eat();
        z.hair();
        z.sound();
        f.movement();
    }
}