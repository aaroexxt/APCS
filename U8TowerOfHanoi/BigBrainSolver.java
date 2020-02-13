import java.util.Scanner;
import java.util.ArrayList;

public class BigBrainSolver {
    private static Scanner in;
    private static ArrayList<Integer> aList;
    private static ArrayList<Integer> bList;
    private static ArrayList<Integer> cList;
    public static void main(String[] args) {
        aList = new ArrayList<Integer>();
        bList = new ArrayList<Integer>();
            cList = new ArrayList<Integer>();
            in  = new Scanner(System.in);
            System.out.println("Welcome to the big brain solver. How big do you want the game to be?");
            int disks = in.nextInt();
            
            generateGame(disks, aList, bList, cList);
        solveN(disks, aList, bList, cList);
    }
    public static void generateGame(int n, ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        b.clear();
        c.clear();
        for (int i = 1; i <= n; i++){
        a.add(i);
        }
    }   
    
    public static void solveN(int n, ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        System.out.println("n == "+n);
        if (n == 1) {
            movePiece(a, c, 'A', 'C');
            System.out.println("that's a wrap folks");
            return;
        } 
            boolean isRealB = !(n%2 == 0);
        for (int i=0; i<n; i++) {
            System.out.println("i == "+i);
            if (i == n-2) { //Flipped version of the previous
                System.out.println("BOI");
                movePiece(c, a, !isRealB ? 'B':'C', 'A');
                movePiece(b, a, isRealB ? 'B':'C' , 'A');
                movePiece(c, b, !isRealB ? 'B':'C', isRealB ? 'B':'C');
            } 
            else {
                if (i%2 == 0) {
                    movePiece(a, c, 'A', !isRealB ? 'B':'C');
                    movePiece(a, b, 'A', isRealB ? 'B':'C');
                    movePiece(c, b, !isRealB ? 'B':'C', isRealB ? 'B':'C');
                } else {
                    movePiece(a, c, 'A', !isRealB ? 'B':'C');
                    movePiece(b, a, isRealB ? 'B':'C', 'A');
                    movePiece(b, c, isRealB ? 'B':'C', !isRealB ? 'B':'C');
                }
            }
    }
    
    
    
    solveN(n-1, a, c, b);
    }
    
    public static void movePiece(ArrayList<Integer> original, ArrayList<Integer> target, char originalPeg, char endPeg) {
        // Top of stack is the end of the ArrayList
        //System.out.println("Move piece " + original.get(original.size() - 1) + " from " + originalPeg + " to " + endPeg);
        System.out.println(originalPeg+" to "+endPeg);
        //target.add(original.remove(original.size() - 1));
    }
}
    
