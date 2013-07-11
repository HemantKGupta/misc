package com.hkg.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (IOException e) {
			e.printStackTrace();
		} finally {
            if (s != null) {
                s.close();
            }
        }
    
	}

}
