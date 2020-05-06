//PART 1

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public static int totalLetters(List<String> wordList) {
	int count = 0;
	for (int i=0; i<wordList.size(); i++) {
		count += wordList.get(i).length();
	}
	return count;
}

public static int basicGapWidth(List<String> wordList, int formattedLen) {
	int strLen = totalLetters(wordList);

	int totalSpace = (formattedLen-strLen); //total space in string is the formatted length minus the length of the string
	return (int)(totalSpace/(wordList.size()-1)); //Divide space by amount of words to get space between word (using int flooring)
}

public static int leftoverSpaces(List<String> wordList, int formattedLen) {
	return formattedLen-totalLetters(wordList)-((wordList.size()-1)*basicGapWidth(wordList, formattedLen)); //total space is word
}

public static String format(List<String> wordList, int formattedLen) {
	int gapWidth = basicGapWidth(wordList, formattedLen);
	String gapStr = "";
	for (int i=0; i<gapWidth; i++) {
		gapStr+=" ";
	}

	int leftoverSpaces = leftoverSpaces(wordList, formattedLen);

	String finalStr = "";
	for (int i=0; i<wordList.size(); i++) {
		finalStr+=wordList.get(i);
		finalStr+=gapStr;
		if (leftoverSpaces > 0) {
			finalStr+=" ";
			leftoverSpaces--;
		}
	}
	return finalStr;
}

//PART 2

public Digits(int num) {
	String numStr = (String)num;
	for (int i=0; i<numStr.length(); i++) {
		digitList.add((int)numStr.charAt(i));
	}
}

public boolean isStrictlyIncreasing() {
	boolean increasing = true;
	for (int i=1; i<digitList.size(); i++) {
		if (digitList.get(i) <= digitList.get(i-1)) {
			increasing = false;
			break;
		}
	}
	return increasing;


//PART 3

public interface StudyPractice {
	String getProblem();
	void nextProblem();
}

public class MultPractice implements StudyPractice {
	private int firstInt;
	private int secondInt;

	public MultPractice(int firstInt, int initialSecondInt) {
		this.firstInt = firstInt;
		this.secondInt = initialSecondInt;
	}

	public String getProblem() {
		return Integer.toString(firstInt)+" TIMES "+Integer.toString(secondInt);
	}

	public void nextProblem() {
		this.secondInt++;
	}
}