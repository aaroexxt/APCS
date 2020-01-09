public class Array2D {
    public static void main(String[] args) {
        Time[][] times = new Time[4][5];
        System.out.println("inputting times");
        for (int i=0; i<times.length; i++) {
            for (int j=0; j<times[i].length; j++) {
                times[i][j] = new Time(i, j);
            }
        }
        
        System.out.println("printing times");
        for (Time[] tOuter : times) {
            for (Time tInner : tOuter) {
                System.out.print(tInner+" ");
            }
            System.out.println();
        }
    }
}