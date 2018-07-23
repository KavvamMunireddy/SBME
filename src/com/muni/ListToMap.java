package com.muni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Muni");
		names.add("Muni1");
		names.add("Muni2");
		names.add("Muni3");
		names.add("Muni4");
		// Map<String, Integer> namesMap =
		// names.stream().collect(Collectors.toMap(name -> name, 0));
		Map<String, Integer> namesMap = new HashMap<>();
		for (String str : names) {
			namesMap.put(str, 0);
		}
	}
}
