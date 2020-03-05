public class Canine extends Animal
{
public void makeNoise(String type)
{
System.out.println (type + " generic canine noise");
}
public void roam(String type)
{
System.out.println (type + " generic canine roam about");
}
public void eat(String type)
{
System.out.println (type + " generic canine eat meat");
}
public void bite(String type)
{
System.out.println (type + " generic canine bites");
}
public int numberInTheHouse( )
{
return(number);
}
public int number = 0;
}