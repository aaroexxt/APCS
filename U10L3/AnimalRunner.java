import java.util.*;
public class AnimalRunner
{
    public static void main(String[] args)
    {
        ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
        dogcatList.add(new Dog("Fred"));
        dogcatList.add(new Cat("Wanda"));
        for (Speakable obj : dogcatList)
        {
         obj.speak();
        }
        
        Dog d1 = new Dog("Fred");
        d1.speak();
        Object dObj = new Dog("Connie");
        Dog d2 = (Dog)dObj;
        d2.speak();
    }
}