public class TestProgram
{
public static void main(String[ ] args)
{
Animal genericAnimal = new Animal( );
Canine genericCanine = new Canine( );
Wolf bigBad = new Wolf( );
Dog Lassie = new Dog( );
Cat Garfield = new Cat( );
FemaleHuman FDoe = new FemaleHuman ( );
MaleHuman MDoe = new MaleHuman( );
genericAnimal.makeNoise("x");
genericAnimal.roam("x");
genericAnimal.eat("x");
System.out.println("Number in the house: " + genericAnimal.numberInTheHouse( ));
System.out.println( );
genericCanine.makeNoise("y");
genericCanine.roam("y");
genericCanine.eat("y");
genericCanine.bite("y");
System.out.println("Number in the house: " + genericCanine.numberInTheHouse( ));
System.out.println( );
bigBad.makeNoise("Wolf");
bigBad.roam("Wolf");
bigBad.eat("Wolf");
bigBad.bite("Wolf");
System.out.println("Number in the house: " + bigBad.numberInTheHouse( ));
System.out.println( );
Lassie.makeNoise("Dog");
Lassie.roam("Dog");
Lassie.eat("Dog");
Lassie.bite("Dog");
System.out.println("Number in the house: " + Lassie.numberInTheHouse( ));
System.out.println( );
Garfield.makeNoise("Cat");
Garfield.roam("Cat");
Garfield.eat("Cat");
Garfield.scratch("Cat");
System.out.println("Number in the house: " + Garfield.numberInTheHouse( ));
System.out.println();
FDoe.makeNoise("Female Human");
FDoe.roam("Female Human");
FDoe.eat("Female Human");
FDoe.bite("Female Human");
System.out.println("Number in the house: " + FDoe.numberInTheHouse( ));
System.out.println();
MDoe.makeNoise("Male Human");
MDoe.roam("Male Human");
MDoe.eat("Male Human");
System.out.println("Number in the house: " + MDoe.numberInTheHouse( ));
System.out.println( );
System.out.println("Bye");
}
}