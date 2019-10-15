public class Part3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        int counter = 0;
        for (int i=2; i<numbers.length*2+2; i+=2) {
            numbers[counter] = i;
            System.out.print(numbers[counter]+" ");
            counter++;
        }
        System.out.println("\nPositive numbers: "+numbers.length);
    }
}
