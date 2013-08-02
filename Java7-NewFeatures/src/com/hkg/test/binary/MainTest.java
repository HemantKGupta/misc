package com.hkg.test.binary;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = Integer.parseInt("1100110", 2);
		System.out.println(x);
		int y = 0b1100110;
		System.out.println(y);
		
		long anotherLong = 2_147_483_648L;
		int bitPattern = 0b0001_1100__0011_0111__0010_1011__1010_0011;
		System.out.println(anotherLong);
		System.out.println(bitPattern);
		
	}

}
