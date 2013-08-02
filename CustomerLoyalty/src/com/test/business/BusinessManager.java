package com.test.business;

import java.util.List;
import java.util.Map;

import com.test.Model.Customer;
import com.test.Model.Purchase;

/**
 * @author HemantG
 *
 */
public interface BusinessManager {
	public Map<Integer, Customer> processInput(List<Purchase> purchaseList);
}
