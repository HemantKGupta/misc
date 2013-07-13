package com.hkg.test.enm;

public class EnumInsideClassTest {
	  public static void main (String[] args)  {
		    Coffee drink = new Coffee();
		    drink.size = Coffee.CoffeeSize.BIG;   // enclosing class name required
		    System.out.println(drink.size);
		  }

}

class Coffee {

	  enum CoffeeSize  {BIG, HUGE, OVERWHELMING  }
	  CoffeeSize size;

	}
