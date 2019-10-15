public class Part3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        int min = 0;
        int positiveCount = 0;
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = ((int)(Math.random()*200)+1)-100;
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > 0) {
                positiveCount++;
            }
        }
        
        int count = 0;
        while (count < numbers.length) {
            System.out.print(numbers[count]+" ");
            count++;
        }
        System.out.println("\nMin: "+min);
        System.out.println("Positive numbers: "+positiveCount);
    }
}