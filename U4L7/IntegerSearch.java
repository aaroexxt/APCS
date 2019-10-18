public class IntegerSearch {
    private static int[] nums = {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67};
    public static void main(String[] args) {}
    public static int lookup(int toFind) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}