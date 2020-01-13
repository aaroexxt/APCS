public class SkyView {
    private double[][] view;
    
    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        
        int rC = 0; //rowCount
        int cC = 0; //colCount
        boolean direction = true; //true right, false left
        for (int i=0; i<scanned.length; i++) {
            view[rC][cC] = scanned[i];
            if (direction) {
                cC++;
            } else {
                cC--;
            } 
            if (cC == numCols) {
                direction=!direction; //reverse direction
                cC--; //remove 1, because it'll be out of bounds
                rC++; //add 1 to row, go down one
            } else if (cC == -1) {
                direction=!direction; //reverse direction
                cC++; //add 1, because it'll be out of bounds
                rC++; //add 1 to row, go down one
            }
        } 
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0;
        int count = 0;
        for (int i=startRow; i<=endRow; i++) {
            for (int j=startCol; j<=endCol; j++) {
                total+=view[i][j]; //add up elem
                count++; //add 1 to counter
            }
        }
        return total/count;
    }
    
    public String toString() {
        String output = "";
        for (int i=0; i<view.length; i++) {
            for (int j=0; j<view[i].length; j++) {
                output+=Double.toString(view[i][j]);
                output+="\t";
            }
            output+="\n";
        }
        return output;
    }
}