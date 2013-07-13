package com.hkg.test.enm;

public class EnumOutsideClassTest {
	public static void main(String[] args) {
	      Coffee2 drink = new Coffee2();
	      drink.size = CoffeeSize.BIG;
	      System.out.println(drink.size); // enum outside class
	   }

}
enum CoffeeSize { BIG, HUGE, OVERWHELMING }  

class Coffee2 {
	   CoffeeSize size;
	}
