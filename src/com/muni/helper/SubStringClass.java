package com.muni.helper;

public class SubStringClass {
	public static void main(String[] args) {

		String str = "PAY-20180406AC4C58AB,CC-201804061BD68314,PAYACK-201804061BD68314";
		String[] string = str.split(",");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i].substring(0, string[i].indexOf('-')));
		}
	}

}
