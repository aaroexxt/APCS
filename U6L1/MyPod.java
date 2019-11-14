















// Java program to demonstrate working of ArrayList in Java 
import java.io.*; 
import java.util.*; 

public class MyPod {
    private String color;
    private double memCapacity;
    private ArrayList<Song> songLibrary;
    
    public MyPod(String color, double memCapacity, ArrayList<Song> songLibrary) {
        this.color = color;
        this.memCapacity = memCapacity;
        this.songLibrary = songLibrary;
    }
    public MyPod() {
        this.color = "blue";
        this.memCapacity = 16.5; //gb
        this.songLibrary = new ArrayList<Song>(3);
    }
    public String toString() {
        String outputStr = "Color: "+this.color+",\n memCapacity: "+this.memCapacity+",\n songLibrary: ";
        for (Song s : songLibrary) {
            outputStr += s.toString()+"\n";
        }
        return outputStr;
    }
}
    