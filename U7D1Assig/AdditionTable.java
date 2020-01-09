public class AdditionTable {
    public static void main(String[] args) {
        int[][] addTable = new int[3][4];
        
        for (int i=0; i<addTable.length; i++) {
            for (int j=0; j<addTable[i].length; j++) {
                addTable[i][j] = i+j;
                
                System.out.print(addTable[i][j]+" ");
            }
            System.out.println();
        }
    }
}