public class Part2 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        
        int max = 0;
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100)+1;
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        /*** PART B
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        
        //PART C
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println("Max: "+max);
    }
}