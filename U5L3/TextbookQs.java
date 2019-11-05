public class TextbookQs {
    public static void main(String[] args) {
        String ssStr = "987-65-4321";
        System.out.println(ssStr+", noDash: "+removeDashes(ssStr));
        
        String dateStr = "31-05-2019";
        String[] dateArr = dateStr.split("-");
        String newDate = dateArr[1]+"-"+dateArr[0]+"-"+dateArr[2];
        System.out.println(dateStr+", newFormat: "+newDate);
        
        String toScroll = "ohell";
        System.out.println("original string: "+toScroll+", scrolled: "+scroll(toScroll));
        
        String name = "Becker, Aaron";
        System.out.println("Name: "+name+", replaced: "+convertName(name));
        
        String rev = "00100101011";
        System.out.println("original: "+rev+", rev: "+reverseString(rev));
        
        String checkDigits = "asjkdh1";
        System.out.println("String: "+checkDigits+", hasDigits?: "+digits(checkDigits));
    }
    
    public static String removeDashes(String originalString) {
        String noDash = originalString.replace("-", "");
        return noDash;
    }
    
    public static String scroll(String original) {
        return original.substring(1)+original.substring(0,1);
    }
    
    public static String convertName(String name) {
        String[] splitName = name.split(",");
        return splitName[1].trim()+" "+splitName[0].trim();
    }
    
    public static String reverseString(String toReverse) {
        String repl1 = toReverse.replace("0","a"); //kinda meme strat ngl
        repl1 = repl1.replace("1","b");
        repl1 = repl1.replace("a","1");
        repl1 = repl1.replace("b","0");
        return repl1;
    }
    
    public static boolean digits(String check) {
        String replacedCheck = check.replace("0","a").replace("1","a").replace("2","a").replace("3","a").replace("4","a").replace("5","a").replace("6","a").replace("7","a").replace("8","a").replace("9","a");
        return !check.equals(replacedCheck);
    }
}
        
    