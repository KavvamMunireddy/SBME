package com.muni.reddy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfList {
	public static void main(String[] args) {
		List<String> cDupList = new ArrayList<>();
		List<String> dupList = main();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < dupList.size(); i++) {
			if (map.containsKey(dupList.get(i))) {
				map.put(dupList.get(i), map.get(dupList.get(i)) + 1);
			} else {
				map.put(dupList.get(i), 1);
			}
			cDupList.add(dupList.get(i) + "--" + map.get(dupList.get(i)));
			System.err.println(dupList.get(i) + "::Occurance::" + map.get(dupList.get(i)));
		}
		System.err.println("=========================");
		System.err.println(cDupList);
		System.err.println("=========================");
		System.err.println(dupList);
	}

	public static List<String> main() {

		List<String> list = new ArrayList<>();
		list.add("MuniReddy");
		list.add("Muni");
		list.add("Reddy");
		list.add("Muni");
		list.add("Vivek");
		list.add("Reddy");
		list.add("MuniReddy");
		list.add("Muni");

		return list;
	}

}
