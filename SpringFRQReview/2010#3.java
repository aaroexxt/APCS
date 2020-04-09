//2010 #3

public boolean isLevelTrailSegment(int start, int end) {
	int min, max;
	min = max = markers[start];

	for (int i=start+1; i<end; i++) {
		int elev = markers[i];
		if (elev > max) {
			max = elev;
		}
		if (elev < min) {
			min = elev;
		}
	}

	if (Math.abs(max-min) > 10) {
		return false;
	} else {
		return true;
	}
}

public boolean isDifficult() {
	int dCount = 0;
	for (int i=1; i<markers.length; i++) {
		if (Math.abs(markers[i]-markers[i-1]) >= 30) {
			dCount++;
		}
	}

	if (dCount >= 3) {
		return true;
	} else {
		return false;
	}
}