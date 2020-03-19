import java.util.ArrayList;
public class AnalogDigitalDriver {
    public static void main() {
        BWTV bw = new BWTV();
        HDTV hd = new HDTV();
        
        ArrayList<TV> tvList = new ArrayList<TV>();
        tvList.add(bw);
        tvList.add(hd);
        
        //Print basic tv info
        for (TV tv : tvList) {
            System.out.println("Type: "+tv.tvType()+", isOn: "+tv.getTVOn());
        }
        
        //Set TVs on
        for (int i=0; i<tvList.size(); i++) {
            tvList.get(i).setTVOn(true);
        }
        
        System.out.println();
        //Print basic info again
        for (TV tv : tvList) {
            System.out.println("Type: "+tv.tvType()+", isOn: "+tv.getTVOn());
        }
        
        //RotRabbitEars
        System.out.println("RotREars BWTV: "+bw.rotateRabbitEars());
        
        //ConnectHDMI
        System.out.println("ConnHDMI HDTV: "+hd.connectHDMI());
    }
}