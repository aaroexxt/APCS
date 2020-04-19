/** Takes a string str and returns a new string

* with the characters reversed.

*/

public static String reverseString(String str)

{

String result = "";

for (int i=str.length()-1; i>=0; i--) {
	result+=(String)str.charAt(i);
}

return result;

}