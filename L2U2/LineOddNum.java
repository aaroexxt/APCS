public class LineOddNum {
    public static void main(String[] args) {
        int oddNum = 1;
        for (int i=5; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("-");
            }
            for (int j=0; j<oddNum; j++) {
                System.out.print(oddNum);
            }
            for (int j=0; j<i; j++) {
                System.out.print("-");
            }
            oddNum+=2;
            System.out.println();
        }
    }
}