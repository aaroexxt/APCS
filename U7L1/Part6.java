public class Part6 {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        int count = 1;
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) {
                nums[i][j] = count;
                count++;
            }
        }
        
        for (int[] outer : nums) {
            for (int inner : outer) {
                System.out.print(inner+"\t");
            }
            System.out.println();
        }
        
        int total = 0;
        for (int[] outer : nums) {
            for (int inner : outer) {
                total+=inner;
            }
        }
        System.out.println("Sum total: "+total);
        
        for (int i=0; i<nums.length; i++) {
            total = 0;
            for (int j=0; j<nums[i].length; j++) {
                total+=nums[i][j];
            }
            System.out.println("Row "+i+" total: "+total);
        }
        
        int[] columnTotals = new int[nums[0].length];
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) {
                columnTotals[j]+=nums[i][j];
            }
        }
        for (int i=0; i<columnTotals.length; i++) {
            System.out.println("Column "+i+" total: "+columnTotals[i]);
        }
        
    }
}
            