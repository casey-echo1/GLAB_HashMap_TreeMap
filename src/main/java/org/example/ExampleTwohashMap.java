package org.example;

import java.util.HashMap;

public class ExampleTwohashMap {
	public static void main(String[] args) {
		HashMap<String, String> newHashMap = new HashMap<>();
		newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motorola");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", "null");
		newHashMap.put(null, "Sony");
		System.out.println("Original map contains: " + newHashMap);

		System.out.println("Size of original Map is: " + newHashMap.size());

		HashMap<String, String> copyHashMap = new HashMap<>(newHashMap);
		System.out.println("copyHashMap mappings= " + copyHashMap);

		String nullKeyValue = copyHashMap.remove(null);
		System.out.println("copyHashMap null key value =  " + nullKeyValue);
		System.out.println("copyHashMap after removing null key =  " + copyHashMap);
		System.out.println("Size of copyHashMap is: " + copyHashMap.size());
	}
}
