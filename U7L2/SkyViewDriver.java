public class SkyViewDriver {
    public static void main(String[] args) {
        double[] scanned = {
            0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9
        };
        SkyView s = new SkyView(4, 3, scanned);
        
        System.out.println("Array after initialization: \n"+s);
        System.out.println("Average: "+s.getAverage(1,2,0,1));
    }
}