import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = in.nextInt();
        System.out.println("Enter columns: ");
        int columns = in.nextInt();
        
        int table[][] = new int[rows][columns];
        int rowCount = 0;
        int colCount = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                if (i==0) { //Row labels
                    table[i][j] = rowCount;
                    rowCount++;
                } else if (j == 0) { //Column labels
                    table[i][j] = colCount;
                    colCount++;
                } else {
                    table[i][j] = i*j;
                }
            }
        }
        
        for (int[] outer : table) {
            for (int inner : outer) {
                System.out.print(inner+"\t");
            }
            System.out.println();
        }
    }
}
   