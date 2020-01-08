public class Classwork { 
    public static void main(String[] args) {
        int[][] testGrades = {
            {90, 80, 60, 95},
            {80, 70, 55, 65},
            {86, 91, 90, 88}
        };
        String[] names = {
            "Karen",
            "Joseph",
            "Jenna"
        };
        double[] averages = new double[names.length];
        
        //Print stuff
        System.out.println("Students Grades");
        for (int i=0; i<names.length; i++) {
            System.out.print(names[i]+": ");
            for (int s : testGrades[i]) {
                System.out.print(s+", ");
            }
            System.out.println();
        }
        
        //Calculate averages
        double avg = 0.0;
        int tot = 0; //amnt of grades in a row (for ragged arrays)
        for (int i=0; i<testGrades.length; i++) {
            avg = 0;
            tot = 0;
            for (int grade : testGrades[i]) {
                avg+=grade;
                tot++;
            }
            avg /= tot;
            averages[i] = avg;
        }
        
        //Print averages
        System.out.println("The average scores for the students are: ");
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]+": "+averages[i]);
        }
        
        //Calculate max
        double max = averages[0];
        int mIndex = 0;
        for (int i = 1; i<averages.length; i++) {
            if (averages[i] > max) {
                max = averages[i];
                mIndex = i;
            }
        }
        
        //Print max
        System.out.println(names[mIndex]+" has the highest test average of: "+averages[mIndex]);
    }
}