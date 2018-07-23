package com.muni.reddy;

import java.util.Scanner;

public class StarPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter number:: ");
		int rows = scanner.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.err.print("* ");
			}
			System.err.print("\n");
		}
	}
}
