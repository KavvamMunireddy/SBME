package com.muni.reddy;

import java.util.Scanner;

public class AlphabeticPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the uppercase character you want to print in last row:: ");
		String rows = scanner.next();
		char alphabet = 'A';
		char alphabet1 = rows.charAt(0);
		for (int i = 1; i <= (alphabet1 - 'A' + 1); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(alphabet + " ");
			}
			++alphabet;
			System.out.print("\n");
		}
	}
}
