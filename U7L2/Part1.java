import java.util.Scanner;
public class Part1 {
    public static void main(String[] args) {
        double arr1[] = new double[4];
        for (int i=0; i<arr1.length*2; i+=2) {
            arr1[i] = i;
        }
        
        Scanner in = new Scanner(System.in);
        String arr2[] = new String[5];
        for (int i=0; i<arr2.length; i++) {
            System.out.println("Fill pos: "+i);
            String l = in.nextLine();
            arr2[i] = l;
        }

        String arr3[][] = new String[4][5];
        for (int i=0; i<arr3.length; i++) {
            for (int j=0; j<arr3[i].length; j++) {
                arr3[i][j] = "The value is: "+(i*j);
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
        
        String arr4[][] = new String[3][2];
        for (int i=0; i<arr4.length; i++) {
            for (int j=0; j<arr4[i].length; j++) {
                System.out.println("Fill pos: "+i+", "+j);
                arr4[i][j] = in.nextLine();
            }
        }
        
        int arr5[][] = {
            {0, -1, -2},
            {1, 0, -1},
            {2, 1, 0},
            {3, 2, 1}
        };
    }
}
        
        