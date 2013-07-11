package com.hkg.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyByteStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			//in = new FileInputStream("D:/WSs/Misc/IO-Examples/src/com/hkg/test/xanadu.txt");
			in = new FileInputStream("xanadu.txt");
			out = new FileOutputStream("outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
