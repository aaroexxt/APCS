import java.util.Arrays;

public class driver {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(nums));
        
        int[] a = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            a[i] = nums[i];
        }
        SelectionSortReverse.sort(a);
        System.out.println("Reverse selection sort: ");
        System.out.println(Arrays.toString(a));
        
        Coin[] b = new Coin[nums.length];
        for (int i=0; i<nums.length; i++) {
            b[i] = new Coin(nums[i]);
        }
        SelectionSortCoins.sort(b);
        System.out.println("Coin sort: ");
        System.out.println(Arrays.toString(b));
        
        String[] c = ArrayUtil.randomStringArray(20, 100);
        
        MergeSorterStrings.sort(c);
        System.out.println("Array string sort: ");
        System.out.println(Arrays.toString(c));
        
        int[] sizes = {10000,20000,90000};
        
        for (int i=0; i<sizes.length; i++) {
            int[] d = ArrayUtil.randomIntArray(sizes[i], sizes[i]);
            MergeSorter.resetCounter();
            MergeSorter.sort(d);
            System.out.println("Array size: "+sizes[i]+", comparisons: "+MergeSorter.getCounter());
        } 
        
        /*
         * Results:
            Array size: 10000, comparisons: 120488
            Array size: 20000, comparisons: 260862
            Array size: 90000, comparisons: 1369455
         */
        
          
    }
}