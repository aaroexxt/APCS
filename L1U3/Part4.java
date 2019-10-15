public class Part4 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100)+1;
        }
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        int even = 0;
        int odd = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]%2 == 0) {
               even++;
            } else {
                odd++;
            }
        }
        System.out.println("\nEven numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
