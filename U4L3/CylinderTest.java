import java.util.Scanner;
public class CylinderTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What radius to make the cylinder?");
        double radius = in.nextDouble();
        System.out.println("What height to make the cylinder?");
        double height = in.nextDouble();
        
        Cylinder cylinder = new Cylinder(radius, height);
        
        //Uses toString method
        System.out.println(cylinder.toString()+", surface area: "+cylinder.getSurfaceArea());
    }
}