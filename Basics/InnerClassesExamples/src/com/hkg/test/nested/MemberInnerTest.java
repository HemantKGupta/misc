package com.hkg.test.nested;

public class MemberInnerTest {
	public static void main(String[] args) {
	new MyOuter().makeInner();
	
	MyOuter mo = new MyOuter();     // gotta get an instance!
	MyOuter.MyInner inner = mo.new MyInner();
	inner.seeOuter();

	}

}


class MyOuter {
	   private int x = 7;
	   public void makeInner() {
	      MyInner in = new MyInner();  // make an inner instance
	      in.seeOuter();
	   }

	   class MyInner {
	      public void seeOuter() {
	         System.out.println("Outer x is " + x);
	      }
	   }
	}
