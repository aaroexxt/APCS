/*
* 2016 #2
*/

public LogMessage(String message) {
	machineId = message.split(":")[0];
	description = message.split(":")[1];
}

public boolean containsWord(String keyword) {
	String[] split = description.split(" ");
	if (split.length == 0) {
		return false;
	}
	for (int i=0; i<split.length; i++) {
		if (split[i].equals(keyword)) { //Do not ignore case matching
			return true;
		}
	}
	//If we've gotten here, we haven't found it yet, so return false
	return false;
}