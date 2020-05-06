Question 1

Part A

Start A: 1:00 AM
End A: 1:03 AM

public int limitAmplitude(int limit) {
	int changes = 0;
	for (int i=0; i<samples.length; i++) {
		if (samples[i] > limit) {
			samples[i] = limit;
			changes++;
		}
		if (samples[i] < -limit) {
			samples[i] = -limit;
			changes++;
		}
	}
	return changes;
}

Part B

Start B: 1:03 AM
End B: 1:08 AM

public void trimSilenceFromBeginning() {
	int startInd = -1;
	for (int i=0; i<samples.length; i++) {
		if (samples[i] != 0) {
			startInd = i;
			break;
		}
	}

	int trimmedSamples = new int[samples.length-(startInd+1)];
	int nSampCounter = 0;
	for (int i=startInd; i<samples.length; i++) {
		trimmedSamples[nSampCounter] = samples[i];
		nSampCounter++;
	}

	samples = trimmedSamples;
}

Question 2

Part A

Start Time: 1:08AM
End Time: 1:19 AM

public static String scrambleWord(String word) {
	String finalStr = "";

	int curInd = 0;

	while (curInd < word.length()) {
		if (word.charAt(curInd) == 'A' || word.charAt(curInd) == 'a') {
			if (curInd < word.length()-1) { //make sure we can swap w/o going out of bounds
				if (word.charAt(curInd+1) != 'A' && word.charAt(curInd+1) != 'a') {
					finalStr += word.charAt(curInd+1);
					finalStr += word.charAt(curInd);
					curInd+=2; //advance 2 characters
				} else {
					finalStr += word.charAt(curInd);
					curInd++;
				}
			} else { //can't do swap so just add (edge case)
				finalStr += word.charAt(curInd);
				curInd++;
			}
		} else {
			finalStr += word.charAt(curInd);
			curInd++; //advance one character
		}
	}

	return finalStr;
}

Part B

Start Time: 1:19 AM
End Time: 1:24 AM

public static void scrambleOrRemove(List<String> wordList) {
	int i = 0;
	while (i < wordList.size()) {
		String word = wordList.get(i);
		if (scrambleWord(word) == word) {
			wordList.remove(i); //don't increment index here since we've removed word
		} else {
			wordList.set(i, scrambleWord(word));
			i++;
		}
	}
}

Question 3

Part A
Start Time: 1:25 AM
End Time: 1:30 AM

Part B
Start Time: 1:30 AM
End Time: 1:32 AM lmao speedy

public class WordPairList {
	private ArrayList<WordPair> allPairs;

	public WordPairList(String[] words) {
		allPairs = new ArrayList<WordPair>();
		for (int i=0; i<words.length; i++) {
			for (int j=0; j<words.length; j++) {
				//make sure there's no same word pairs
				if (i != j) {
					allPairs.add(new WordPair(words[i], words[j]));
				}
			}
		}
	}

	public int numMatches() {
		int matches = 0;
		for (int i=0; i<allPairs.size(); i++) {
			WordPair elem = allPairs.get(i);
			if (elem.getFirst().equals(elem.getSecond())) { //eq method for strings
				matches++;
			}
		}
		return matches;
	}
}

Question 4

Start Time 1:33 AM
End Time 1:36 AM speeeedrun

public class APLine {
	private int a;
	private int b;
	private int c;

	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getSlope() {
		return -(double)a/(double)b;
	}

	public boolean isOnLine(int x, int y) {
		return (((a*x)+(b*y)+c) == 0);
	}
}