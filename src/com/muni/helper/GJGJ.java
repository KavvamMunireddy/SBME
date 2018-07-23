package com.muni.helper;

import java.util.ArrayList;
import java.util.List;

public class GJGJ {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		getListString(list);
		System.err.println(list);
		System.err.println(list.size());
		double to = Double.doubleToLongBits(10);
		double tota = Double.doubleToLongBits(10);
		System.err.println(to == tota);
	}

	private static void getListString(List<String> list) {
		list.add("kjahfk");
		list.add("kjahfk");
		list.add("kjahfk");
		list.add("kjahfk");
		list.add("kjahfk");
		list.add("kjahfk");
		list.add("kjahfk232144");
	}
}
