package com.muni;

public class Reddy {
	public static void main(String[] args) {
		try {
			int a[] = { 7,5,6,7,8 };
			for (int i = 0; i < 7; ++i)
				System.out.println(a[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2");
		}

	}
}
