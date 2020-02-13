import java.util.Random;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }
   
   public static String[] randomStringArray(int length, int n)
   {  
       String[] a = new String[n]; 
        for (int i=0; i<n; i++) {
            a[i] = generateRandomString(length);
        }
       
      
      return a;
   }
   
   public static String generateRandomString(int length) {
       int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   public static void swapCoin(Coin[] a, int i, int j)
   {
      Coin temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      