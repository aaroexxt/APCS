//2018 #2


//Part A
public WordPairList(String[] words) {
	allPairs = new ArrayList<WordPair>(); //Initialize arrayList as specified (this is a point I think)
	for (int i=0; i<words.length; i++) {
		for (int j=0; j<words.length; j++) {
			allPairs.add(new WordPair(words[i], words[j]));
		}
	}
}

//Part B
public int numMatches() {
	int matchCount = 0;
	for (int i=0; i<allPairs.size(); i++) {
		WordPair ind = allPairs.get(i);
		if (ind.getFirst().equals(ind.getSecond())) {
			matchCount++;
		}
	}
	return matchCount;
}

