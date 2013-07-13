package com.hkg.test.nested;

public class LocalVarAccessTest {
	
	public static void main(String[] args) {
		new LocalVarAccessTest().doStuff();
	}
	
	private String x = "Outer2";
	   void doStuff() {
	     //String z = "local variable"; //Won't Compile!
		 final String z = "local variable";
	     class MyInner {
	       public void seeOuter() {
	         System.out.println("Outer x is " + x);
	         System.out.println("Local variable z is " + z);  
	       } // close inner class method
	     }   // close inner class definition
	     
	     MyInner mi = new MyInner();  
         
         mi.seeOuter();
	   }  

}
