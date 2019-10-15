import javax.swing.*;
public class Part4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Daily Temperature Program");
        int numDays = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many days would you like to view?"));
    
        int[] dates = new int[numDays];
        for (int i=1; i<=numDays; i++) {
            dates[i-1] = i;
        }
        
        int dailyTemps[] = new int[numDays];
        for (int i=0; i<numDays; i++) {
            dailyTemps[i] = ((int)(Math.random()*200)-99); //plus one minus 100 - just minus 99
        }
        
        String[] forecast = new String[numDays];
        for (int i=0; i<numDays; i++) {
            int temp = dailyTemps[i];
            forecast[i] = (temp >= 80) ? "Hot!" : (temp < 80 && temp >= 50) ? "Moderate" : (temp < 50 && temp >= 32) ? "Cold" : (temp < 32) ? "Freezing" : "Missing Temperature Range";
        }
        
        System.out.println("\tDaily Temperatures for October 2020\nDate\tDaily Temperature (F)\tForecast");
        for (int i=0; i<numDays; i++) {
            System.out.println(dates[i]+"\t"+dailyTemps[i]+"\t"+forecast[i]);
        }
    }
}