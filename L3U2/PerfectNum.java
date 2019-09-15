public class PerfectNum {
    public static void main(String[] args) {
        int numCounter = 0; //tracks number of numbers found
        int currentNum = 1; //tracks current number that we're on (don't include 0)
        int nonInfinite = 10000; //max loop iterations before exiting
        while (numCounter < 4 && nonInfinite > 0) {
            currentNum++;
            
            int divisorSum = 0;
            int factor = currentNum-1; //don't include the number itself
            while (factor > 0) {
                if (currentNum%factor == 0) {
                    divisorSum += factor;
                }
                factor--;
            }
            if (divisorSum == currentNum) {
                System.out.println("Perfect num found: "+currentNum);
            }
            nonInfinite--;
        }
    }
}