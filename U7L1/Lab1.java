
public class Lab1 {
    public static void main(String[] args) {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("x length: "+x.length);
        System.out.println("x first elem: "+x[0]);
        System.out.println("x last elem: "+x[x.length-1]);
        System.out.println("part e: "+x[x.length-1]); //It's the same because they both refer to the last element
        System.out.println("Printing w/o labels");
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Printing w labels");
        for (int i=0; i<x.length; i++) {
            System.out.println("x["+i+"]: "+x[i]);
        }
        System.out.println("Printing w labels reverse");
        for (int i=x.length-1; i>=0; i--) {
            System.out.println("x["+i+"]: "+x[i]);
        }
        System.out.println("Printing w/o labels enhanced");
        for (double v : x) {
            System.out.println(v);
        }
        System.out.println("Printing total enhanced");
        double total = 0;
        for (double v : x) {
            total+=v;
        }
        System.out.println(total);
        System.out.println("Printing total nonenhanced");
        total = 0;
        for (int i=0; i<x.length; i++) {
            total+=x[i];
        }
        System.out.println(total);
        System.out.println("Printing min value");
        double min = x[0];
        int index = 0;
        for (int i=1; i<x.length; i++) {
            if (x[i] < min) {
                min = x[i];
                index = i;
            }
        }
        System.out.println(min);
        System.out.println("Printing min value index: "+index);
    }
}