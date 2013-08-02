package com.test.business;

import java.util.Map;

import com.test.Model.Customer;
import com.test.Model.Purchase;

/**
 * @author HemantG
 *
 */
public interface ReportGenerator {
	public void printCustomerData(Map<Integer, Customer> customers, Map<Integer, Purchase> transactionMap);
}
