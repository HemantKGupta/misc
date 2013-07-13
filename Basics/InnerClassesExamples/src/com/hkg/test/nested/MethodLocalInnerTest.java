package com.hkg.test.nested;

public class MethodLocalInnerTest {
	
	public static void main(String[] args) {
	 new MethodLocalInnerTest().doStuff();	
	}
		 private String x = "Outer";
	     void doStuff() {
	         class MyInner {
	            public void seeOuter() {
	              System.out.println("Outer x is " + x);
	            } 
	         } 
	         
	         MyInner mi = new MyInner();  
	                                      
	         mi.seeOuter();
	       } 

}

