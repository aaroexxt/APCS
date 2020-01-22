import java.util.Scanner;
public class PracticeProbs {
    public static Scanner in = new Scanner(System.in);
    //Part 3 and 4 is my task, Grant did part 1 and 2 on his computer
    public static void main(String[] args) {
        grid();
        contestants();
    }
    
    public static void grid() {
        int size = 5;
        int[][] grid = new int[size][size];
        int counter = 1;
        
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j<size; j++)
            {
                grid[i][j] = counter;
                counter++;
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void contestants() {
        String[] names = {"Grant SMIITH", "Aaron BOOKER", "Aaron Decker", "James Beret"};
        String[] judgeNams = {"Jeffery Epstein", "Dora the Explora", "Cher Fatty"};
        double[] averages = new double[4];
        int count = 0;
        int score = 0;
        int[][] scores = new int[3][names.length];
        
        String[] shortNames = new String[names.length];
        String[] shortJNames = new String[names.length];
        for (int i=0; i<names.length; i++) {
            String[] sp = new String[names[i].split(" ").length];
            sp = names[i].split(" ");
            shortNames[i] = "";
            for (int j=0; j<sp.length; j++) {
                if (j == 0) {
                    shortNames[i] += sp[j].substring(0,1)+". ";
                } else {
                    shortNames[i] += sp[j]+" ";
                }
            }
        }
        
        for (int i=0; i<judgeNams.length; i++) {
            String[] sp2 = new String[judgeNams[i].split(" ").length];
            sp2 = judgeNams[i].split(" ");
            shortJNames[i] = "";
            for (int j=0; j<sp2.length; j++) {
                if (j == 0) {
                    shortJNames[i] += sp2[j].substring(0,1)+". ";
                } else {
                    shortJNames[i] += sp2[j]+" ";
                }
            }
        }
        
        System.out.println("Welcome to BHS cooking simulator. Students are scored on a scale from 1 to 5");
        for (int i=0; i<scores.length; i++) {
            System.out.println("Judge '"+judgeNams[i]+"' is now judging. Enter scores");
            score = 0;
            for (int j=0; j<scores[i].length; j++) {
                System.out.println("Enter a score for contestant: "+names[j]);
                score = in.nextInt();
                score = (score>5)?5:((score<0)?0:score); //limit to range
                scores[i][j] = score;
            }
        }
        
        for (int i=0; i<scores.length; i++) {
            for (int j=0; j<scores[i].length; j++) {
                averages[j]+=scores[i][j];
            }
        }
        for (int i=0; i<averages.length; i++) {
            averages[i]/=judgeNams.length;
        }
        
        
        for (int i=0; i<scores.length+1; i++) {
            String printStr = "";
            for (int j=0; j<scores[0].length+1; j++) {
                if (i == 0) {
                    if (j == 0) {
                        printStr+="\t";
                    } else {
                        printStr+=shortNames[j-1]+"\t";
                    }
                } else if (j == 0) {
                    printStr+=shortJNames[i-1]+"\t";
                } else {
                    printStr+=scores[i-1][j-1]+"\t\t";
                }
            }
            System.out.println(printStr);
        }
        
        System.out.println("Averages:");
        double avgMax = -1;
        int avgIndex = -1;
        for (int i=0; i<averages.length; i++) {
            double average = averages[i];
            if (average > avgMax) {
                avgMax = average;
                avgIndex = i;
            }
            System.out.println(names[i]+"\t"+average);
        }
        System.out.println("With a score of: "+avgMax+" the winner is: "+names[avgIndex]);
    }
                        
}