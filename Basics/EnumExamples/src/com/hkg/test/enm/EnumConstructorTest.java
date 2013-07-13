package com.hkg.test.enm;

public class EnumConstructorTest {

	
	    public static void main(String[] args) {
	    	CoffeeSize1 x=CoffeeSize1.HUGE;
	    	CoffeeSize1 y=CoffeeSize1.OVERHELMING;
	        System.out.println("Outside class enum with constructor :"+x.getOunce());
	        System.out.println("Outside class enum with constructor :"+y.getLidCode());
	    }
	}


enum  CoffeeSize1{
		BIG(4),HUGE(8),OVERHELMING(16){
			public String getLidCode(){
				return "A";
			} 
		};
		
		private int ounce;
		public int getOunce(){
			return ounce;
		}
		
		CoffeeSize1( int size){
			ounce=size;		
		}
		
		public String getLidCode(){
			return "B";
		}
	

}
