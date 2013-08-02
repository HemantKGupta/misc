package com.test.accessdata;

import java.util.List;
import java.util.Map;

import com.test.Model.Purchase;

/**
 * @author HemantG
 *
 */
public interface DataRefiner {
	
	public Map<Integer, Purchase> createTrasactionIdPurcahseMap(List<Purchase> purchaseList);
	
	public void sortPurchaseDataByPurchaseDate(List<Purchase> purchaseList); 

}
