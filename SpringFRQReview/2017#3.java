/*
* 2017 #3
*/


public void replaceNthOccurrence(String str, int n, String repl) {
	int startIndex = findNthOccurrence(str, n);
	if (nthOccurrence < 0) {
		return; 
	} else {
		int endIndex = startIndex + str.length();
		currentPhrase = currentPhrase.substring(0, startIndex) + repl + currentPhrase.substring(endIndex+1);
	}
}


public void findLastOccurrence(String str) {
	String copy = currentPhrase; //Let's hope java copies by value not reference
	int lastIndex = -1;
	int counter = 1;
	while (true) { //lmao gotta love inFINITE LOOPS
		int index = findNthOccurrence(str, counter);
		if (index < 0) { //When it's not found
			return lastIndex;
		} else {
			lastIndex = index;
			counter++;
		}
	}
}