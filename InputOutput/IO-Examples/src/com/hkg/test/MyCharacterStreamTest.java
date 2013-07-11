package com.hkg.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyCharacterStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("xanadu.txt");
			outputStream = new FileWriter("characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
