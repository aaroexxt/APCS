import java.util.*;
import java.io.*;

public class FamilyList {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<String>();

        family.add("Abigail");
        family.add("Shawn");
        family.add("Rachel");
        family.add("Fluffy");
        family.add("Marvel");
        
        System.out.println("Printing family...");
        for (String s : family) {
            System.out.println(s); //diff line
        }
        
        family.add(2, "Grandma");
        family.add(3, "Uncle");
        family.add(1, "Poppy");
        
        System.out.println("Printing family again...");
        for (String s : family) {
            System.out.print(s+" "); //same line w/space
        }
        
        family.remove(0);
        family.remove(2);
        
        System.out.println("Printing family again...");
        for (String s : family) {
            System.out.println(s); //diff line
        }
        
        family.set(0, "Caron"); //Test the C
        
        System.out.println("Printing family again...");
        for (String s : family) {
            System.out.println(s); //diff line
        }
        
        boolean foundC = false;
        for (int i=0; i<family.size(); i++) {
            if (family.get(i).substring(0,1).toLowerCase().equals("c")) {
                System.out.println("Family member's name '"+family.get(i)+"' starts with a C");
                foundC = true;
            }
        }
        if (!foundC) {
            System.out.println("Nobody in the family's name starts with a C");
        }
    }
}