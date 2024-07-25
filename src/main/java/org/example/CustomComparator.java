package org.example;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {
	@Override
	public int compare(String number1, String number2) {
		int value = number1.compareTo(number2);
		//sort in reverse order
		if (value > 0) return -1;
		if (value < 0) return 1;
		else return 0;
	}
}
