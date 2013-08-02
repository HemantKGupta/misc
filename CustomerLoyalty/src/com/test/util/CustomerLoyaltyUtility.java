package com.test.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.Model.Customer;

/**
 * @author HemantG
 *
 */
public class CustomerLoyaltyUtility {
	public static Date convertStringToDate(String s){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
		Date d=null;
		try {
			s = formatter.format( formatter.parse(s));
			d = (Date)formatter.parseObject(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static String formatDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String sDate= sdf.format(d);
		return sDate;
	}
	
	public static Customer yearEndUpdate(Customer customer){
		
		customer.setTotalLoyalityPoints(customer.getTotalLoyalityPoints()+customer.getCurrentYearLoyalityPoints());
		customer.setCurrentYearLoyalityPoints(0);
		return customer;
		
	}

}
