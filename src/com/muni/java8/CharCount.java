package com.muni.java8;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {
		String str = "WiproTechnologies WiproTechnologies".trim();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char chart = str.charAt(i);
			if (map.containsKey(chart)) {
				map.put(chart, map.get(chart) + 1);
			} else {
				map.put(chart, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
