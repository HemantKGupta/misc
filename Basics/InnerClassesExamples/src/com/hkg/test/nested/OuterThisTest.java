package com.hkg.test.nested;

public class OuterThisTest {
	
	public static void main(String[] args) {	
		
		MyOuter2.MyInner2 inner = new MyOuter2().new MyInner2();
		inner.seeOuter();
	}

}

class MyOuter2 {
	   private int x = 7;
	   public void makeInner() {
	      MyInner2 in = new MyInner2();
	      in.seeOuter();
	   }
	   class MyInner2 {
	      public void seeOuter() {
	         System.out.println("Outer x is " + x);
	         System.out.println("Inner class ref is " + this);
	         System.out.println("Outer class ref is " + MyOuter2.this);
	      }
	   }
}