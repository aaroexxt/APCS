public class StringArray {
    public static void main(String[] args) {
        String[] mySongs = {"Dynamite", "A Good Song", "Stuck In a Dream", "Bad Bad Bad"};
        for (int index = 0; index < mySongs.length; index++) {
            System.out.println(mySongs[index] + " ");
        }
        System.out.println("Array Length: ");
        System.out.println(mySongs.length);
    }
}