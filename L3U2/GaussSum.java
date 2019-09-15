import java.util.Scanner;
public class GaussSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*** PART A
        int num = 1;
        int sum = 0;
        while (num<=100) {
            sum+=num;
            num++;
        }
        System.out.println(sum);
        */
       /*** PART B
        System.out.println("Input n");
        int num = input.nextInt();
        int sum = 0;
        while (num>0) {
            sum+=num;
            num--;
        }
        System.out.println(sum);
        */
       /*** PART C
        System.out.println("Input start n");
        int num = input.nextInt();
        System.out.println("Input n");
        int endNum = num+input.nextInt();
        int sum = 0;
        System.out.println("StartNum: "+num+"\nEndNum: "+(endNum-1));
       do {
           sum+=num;
           num++;
        } while(num<endNum);
        System.out.println("Sum: "+sum);
        */
    }
}