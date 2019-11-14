// Java program to demonstrate working of ArrayList in Java 
import java.io.*; 
import java.util.*; 
public class MyPodDriver {
    public static void main(String[] args) {
        ArrayList<Song> library = new ArrayList(3);
        library.add(new Song());
        library.add(new Song("AnotherTestSong"));
        library.add(new Song("Living on a Prayer"));
        
        
        MyPod CarPod = new MyPod("Blue", 12.5, library);
        System.out.println("CarPod:\n"+CarPod);
    }
}