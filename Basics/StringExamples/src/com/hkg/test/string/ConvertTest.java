package com.hkg.test.string;

public class ConvertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s ="3.4";
		float a = (Float.valueOf(s)).floatValue(); 
		System.out.println(a);
		
		float b= Float.parseFloat(s);
		System.out.println(b);
		
		String ss = Float.toString(3.4f);
		System.out.println(ss);

	}

}
