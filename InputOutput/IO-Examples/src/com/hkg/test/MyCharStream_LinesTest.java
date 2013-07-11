package com.hkg.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCharStream_LinesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("charoutputlines.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
			e.printStackTrace();
        }
	}

}
