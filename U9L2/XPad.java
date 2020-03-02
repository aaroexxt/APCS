public class XPad extends MyDevice
   {
    private String time;
    boolean isPM;
       
    public XPad()
       {
       super();
       this.time = "12:00";
       this.isPM = false;
       }
       
    public XPad( int memory, String color, String time, boolean isPM )
       {
       super( memory, color );
       this.time = time;
       this.isPM = isPM;
       }
    
    public String toString()
       {
       String output = new String();
       
       String amPM = new String();
       if( isPM == false )
          {
          amPM = "AM";    
          }
       else if( isPM == true )
          {
          amPM = "PM";    
          }
       
       output = super.toString() + "\nTime is:  " + time + " " + amPM;
       return output;
       }

   }