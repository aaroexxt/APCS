public class StringStuff {
    public static void main(String[] args) {
        String test = "antidisestablishmentarianism";
        System.out.print("\n"+test.length()+"\n");
        System.out.print(test.indexOf("b")+"\n");
        System.out.print(test.substring(7, 16)+"\n");
        System.out.print(test.replace("i","x")+"\n");
        System.out.print(test.toUpperCase()+"\n");
        System.out.println(test.equals("antidisestablishmentarianism"));
        System.out.println(test == "antidisestablishmentarianism");
    }
}