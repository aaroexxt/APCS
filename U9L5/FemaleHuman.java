public class FemaleHuman extends Animal
{
public void makeNoise(String type)
{
System.out.println (type + " endless chatter");
}
public void roam(String type)
{
System.out.println (type + " roam about the mall");
}
public void bite(String type)
{
System.out.println (type + " bites when mad");
}
public int numberInTheHouse( )
{
return(number);
}
private int number = 3;
}