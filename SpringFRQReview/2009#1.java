//2009 #1

public static int[] getCubeTosses(NumberCube cube, int numTosses) {
	int tosses[] = new int[numTosses];
	for (int i=0; i<numTosses; i++) {
		tosses[i] = cube.toss();
	}
	return tosses;
}

public static int getLongestRun(int[] values) {
	int lRCount = 0; //longest run count
	int cRCount = 0; //current run count
	boolean firstRun = false; //must add two when we detect the first run
	for (int i=1; i<values.length; i++) {
		if (values[i-1] == values[i]) { //We have the same value, so add to current run length extends
			if (!firstRun) { //The first time we detect the run, we have to add 2 because we are comparing two numbers
				cRCount+=2;
				firstRun = true;
			} else {
				cRCount++;
			}
		} else if (cRCount > 0) { //CRcount is greater than zero and values differ, so run has ended
			if (cRCount > lRCount) { //Check if it's greater
				lRCount = cRCount;
			}
			cRCount = 0; //reset run counter
			firstRun = false; //Reset firstRun counter
		}
	}
	//Once we get to the end we could still have an outstanding run, so account for that;
	if (cRCount > lRCount) { //Check if it's greater
		lRCount = cRCount;
	}

	if (lRCount == 0) {
		return -1; //Neg 1 if no run
	} else {
		return lRCount;
	}
}
