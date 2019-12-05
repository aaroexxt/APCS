import java.util.*;
import java.lang.reflect.*;


public class GameEngine {
    //ArrayList of generic Objects so that user can pass in any type of shape
    private ArrayList<Object> shapes = new ArrayList<Object>();

    public GameEngine(Object ...shapePassIn) {
        System.out.println("Number of shapes: "+shapePassIn.length);
        for (Object s : shapePassIn) {
            shapes.add(s);
        }
    }

    public String toString() {
        String output = "";
        for (Object s : shapes) {
            output+= s+"\n";
        }
        return output;
    }
    
    public Object getShape(int index) {
        return shapes.get(index);
    }
    
    public String[] getShapeStringTable(int index) {
        //First, get the object
        Object shape = getShape(index);
        //Next, get it's class using getClass method
        Class<?> shapeClass = shape.getClass();
        
        //Create returned stringTable
        String[] stringTable = {"ERR"};
        try {
            //Get getStringTable method to invoke using java.reflect
            Method getStringTableMethod = shapeClass.getMethod("getStringTable");
            //Invoke stringTable method
            stringTable = (String[])getStringTableMethod.invoke(shape); //explicit cast
        } catch(NoSuchMethodException e) {
            System.out.println("uhhh noSuchMethodException thrown on getStringTable; did you pass in a shape?");
        } catch (IllegalAccessException e) {
            System.out.println("uhhh illegalAccessException thrown on getStringTable; did you pass in a shape?");    
        } catch (InvocationTargetException e) {
            System.out.println("uhhh invocationTargetException thrown on getStringTable; did you pass in a shape?");    
        }
        return stringTable;
    }

}