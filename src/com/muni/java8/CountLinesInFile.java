package com.muni.java8;

import java.io.FileReader;
import java.io.LineNumberReader;

public class CountLinesInFile {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\ka799905\\Desktop\\CFFF.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		int lineNumber = 0;
		while (lnr.readLine() != null) {
			lineNumber++;
		}
		fr.close();
		System.out.println("lineNumbers of File==" + lineNumber);
	}
}
