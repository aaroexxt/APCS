public class ArrayTest {
    public static void main(String[] args) {
        int[] myNumbers = {0, 1, 2, 3, 4, 5, 6, 10, 99, 100 };
        for (int index = 0; index < myNumbers.length; index++) {
            System.out.println(myNumbers[index] + " ");
        }
        System.out.println(myNumbers.length);
    }
}