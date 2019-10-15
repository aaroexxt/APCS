public class Part5 {
    public static void main(String[] args) {
        int[] num1 = new int[15];
        int[] num2;
        
        int even = 0;
        int odd = 0;
        //First, populate num1 with desired random values
        for (int i=0; i<num1.length; i++) {
            num1[i] = (int)(Math.random()*25)+1;
        }
        num2 = arrayCopy(num1); //Then copy array into num2
        for (int i=0; i<num1.length; i++) { //Then do even/odd code (which destroys intial state of num1)
            if (num1[i] %2 == 0) {
                even++;
                num1[i] = 0;
            } else {
                odd++;
            }
        }
        
        //Then print using for/each loops because y not
        for (int n:num1) {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:num2) {
            System.out.print(n+" ");
        }
        System.out.println("\nEven: "+even+"\nOdd: "+odd);
    }
    public static int[] arrayCopy(int[] toCopy) {
        int[] copyArray = new int[toCopy.length];
        for (int i=0; i<toCopy.length; i++) {
            copyArray[i] = toCopy[i];
        }
        return copyArray;
    }
}