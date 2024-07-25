package org.example;

import java.util.TreeMap;

public class MainComparator {
	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

		numbers.put("a", 1);
		numbers.put("b", 2);
		numbers.put("z", 1);
		numbers.put("c", 3);
		numbers.put("d", 4);
		System.out.println("TreeMap: " + numbers);
	}
}
