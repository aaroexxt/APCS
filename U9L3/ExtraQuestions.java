/*
 * a) public class B extends A {}
 * b) public abstract someType someFunction(someArguments);
 * c) In Java, public data members are inherited, but can be overridden. Private data members are not.
 * d) Subclass -> up inheritance tree -> Superclass
 * e) Class extensions is where you inherit methods and variables, where class composition is simply where you don't inherit properties and instead access the second class directly,
 * f) In order to do this, you would need to write a wrapper method that casts them to a common superclass type in order to make sure that the method your're calling exists.
 * h) void methodOverride(sameType sameVarName) {
 *     differentCode();
 *    }
 *  i) void sameMethodName(differentType varName, couldBeDifType otherVarName) {
 *      differentCode();
 *      }
 */ 