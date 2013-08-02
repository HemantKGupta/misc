package com.test.business;

import java.util.Map;

import com.test.Model.Customer;
import com.test.Model.Purchase;
import com.test.util.CustomerLoyaltyUtility;

public class ReportGeneratorImpl implements ReportGenerator {

	

	@Override
	public void printCustomerData(Map<Integer, Customer> customers,
			Map<Integer, Purchase> transactionMap) {
		for (Customer customer : customers.values())
		{
		   // System.out.println(entry.getKey() + "/" + entry.getValue());
		    System.out.println("\nCustomer Name:	"+customer.getName());
		    System.out.println("Customer Email:	"+customer.getEmail());
		    System.out.println("Loyalty Points:	"+customer.getCurrentYearLoyalityPoints());
		    System.out.println("Customer Class:	"+customer.getLoyalityClass());		   
		    System.out.println("Transactions :\n");
		    
		    for (Map.Entry<Integer, Integer> entry : customer.getTransactionToPointsMap().entrySet())
		    {
		        int transactionId = entry.getKey();
		        int points = entry.getValue();
		        Purchase purchase = transactionMap.get(transactionId);
		        System.out.println("		"+CustomerLoyaltyUtility.formatDate(purchase.getPurchaseDate())+"			"+transactionId+"			"+purchase.getPurchaseAmount()+"			"+points);			       
		    }
		   
		    
		}
	}

}
