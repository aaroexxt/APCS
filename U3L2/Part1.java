public class Part1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] random = new int[10];
        int[] squares = new int[10];
        
        for (int i=1; i<=numbers.length; i++) {
            numbers[i-1] = i;
            squares[i-1] = (int)Math.pow(i,2);
            //For random: i is minimum, should range difference between pow and i
            random[i-1] = i+(int)(Math.random()*(squares[i-1]-i))+1;
        }
        
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]+"\t"+squares[i]+"\t"+random[i]);
        }
    }
}