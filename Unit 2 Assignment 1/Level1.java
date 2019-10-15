public class Level1 {
    public static void main(String[] args) {
        int a = 7; //assign a and b
        int b = 5;
        System.out.print("The value of a is "+a+" and it is ");
        if (a>b) {
            System.out.print("greater than ");
        } else if (a<b) {
            System.out.print("less than ");
        } else {
            System.out.print("equal to ");
        }
        System.out.println("b whose value is "+b);
    }
}