package com.muni.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Reddy {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Ananas", "Mango", "Banana", "Beer");
		for (int n = 0; n < words.size(); n++) {
			words.set(n, words.get(n).toUpperCase());
		}
		words = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(words);
		System.out.println(words == words);
		Set<String> set = new HashSet<>();
		set.add("Muni");
		System.out.println(set);
		Map<String, String> map = new HashMap<>();
		map.put("A", "Muni");
		System.out.println(map);
		Hashtable<String, String> map1 = new Hashtable<>();
		map1.put("C", "Muni");
		System.out.println(map1);

	}
}
